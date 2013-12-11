package fr.enseeiht.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.enseeiht.pDLX.Guidance;
import fr.enseeiht.pDLX.Need;
import fr.enseeiht.pDLX.NeedSet;
import fr.enseeiht.pDLX.PDLXPackage;
import fr.enseeiht.pDLX.Ressource;
import fr.enseeiht.pDLX.WorkDefinition;
import fr.enseeiht.pDLX.WorkSequence;
import fr.enseeiht.services.PDLXGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractPDLXSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected PDLXGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PDLXPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PDLXPackage.GUIDANCE:
				if(context == grammarAccess.getGuidanceRule() ||
				   context == grammarAccess.getProcessElementRule()) {
					sequence_Guidance(context, (Guidance) semanticObject); 
					return; 
				}
				else break;
			case PDLXPackage.NEED:
				if(context == grammarAccess.getNeedRule() ||
				   context == grammarAccess.getProcessElementRule()) {
					sequence_Need(context, (Need) semanticObject); 
					return; 
				}
				else break;
			case PDLXPackage.NEED_SET:
				if(context == grammarAccess.getNeedSetRule() ||
				   context == grammarAccess.getProcessElementRule()) {
					sequence_NeedSet(context, (NeedSet) semanticObject); 
					return; 
				}
				else break;
			case PDLXPackage.PROCESS:
				if(context == grammarAccess.getProcessRule()) {
					sequence_Process(context, (fr.enseeiht.pDLX.Process) semanticObject); 
					return; 
				}
				else break;
			case PDLXPackage.RESSOURCE:
				if(context == grammarAccess.getProcessElementRule() ||
				   context == grammarAccess.getRessourceRule()) {
					sequence_Ressource(context, (Ressource) semanticObject); 
					return; 
				}
				else break;
			case PDLXPackage.WORK_DEFINITION:
				if(context == grammarAccess.getProcessElementRule() ||
				   context == grammarAccess.getWorkDefinitionRule()) {
					sequence_WorkDefinition(context, (WorkDefinition) semanticObject); 
					return; 
				}
				else break;
			case PDLXPackage.WORK_SEQUENCE:
				if(context == grammarAccess.getProcessElementRule() ||
				   context == grammarAccess.getWorkSequenceRule()) {
					sequence_WorkSequence(context, (WorkSequence) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     text=STRING
	 *
	 * Features:
	 *    text[1, 1]
	 */
	protected void sequence_Guidance(EObject context, Guidance semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PDLXPackage.Literals.GUIDANCE__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLXPackage.Literals.GUIDANCE__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID wd=[WorkDefinition|ID])
	 *
	 * Features:
	 *    name[1, 1]
	 *    wd[1, 1]
	 */
	protected void sequence_NeedSet(EObject context, NeedSet semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PDLXPackage.Literals.NEED_SET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLXPackage.Literals.NEED_SET__NAME));
			if(transientValues.isValueTransient(semanticObject, PDLXPackage.Literals.NEED_SET__WD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLXPackage.Literals.NEED_SET__WD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNeedSetAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNeedSetAccess().getWdWorkDefinitionIDTerminalRuleCall_3_0_1(), semanticObject.getWd());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ressource=[Ressource|ID] quantity=INT needSet=[NeedSet|ID])
	 *
	 * Features:
	 *    ressource[1, 1]
	 *    quantity[1, 1]
	 *    needSet[1, 1]
	 */
	protected void sequence_Need(EObject context, Need semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PDLXPackage.Literals.NEED__RESSOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLXPackage.Literals.NEED__RESSOURCE));
			if(transientValues.isValueTransient(semanticObject, PDLXPackage.Literals.NEED__QUANTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLXPackage.Literals.NEED__QUANTITY));
			if(transientValues.isValueTransient(semanticObject, PDLXPackage.Literals.NEED__NEED_SET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLXPackage.Literals.NEED__NEED_SET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNeedAccess().getRessourceRessourceIDTerminalRuleCall_1_0_1(), semanticObject.getRessource());
		feeder.accept(grammarAccess.getNeedAccess().getQuantityINTTerminalRuleCall_3_0(), semanticObject.getQuantity());
		feeder.accept(grammarAccess.getNeedAccess().getNeedSetNeedSetIDTerminalRuleCall_6_0_1(), semanticObject.getNeedSet());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID processElements+=ProcessElement*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    processElements[0, *]
	 */
	protected void sequence_Process(EObject context, fr.enseeiht.pDLX.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID quantity=INT)
	 *
	 * Features:
	 *    name[1, 1]
	 *    quantity[1, 1]
	 */
	protected void sequence_Ressource(EObject context, Ressource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PDLXPackage.Literals.RESSOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLXPackage.Literals.RESSOURCE__NAME));
			if(transientValues.isValueTransient(semanticObject, PDLXPackage.Literals.RESSOURCE__QUANTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLXPackage.Literals.RESSOURCE__QUANTITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRessourceAccess().getQuantityINTTerminalRuleCall_3_0(), semanticObject.getQuantity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_WorkDefinition(EObject context, WorkDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PDLXPackage.Literals.WORK_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLXPackage.Literals.WORK_DEFINITION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (linkType=WorkSequenceType predecessor=[WorkDefinition|ID] successor=[WorkDefinition|ID])
	 *
	 * Features:
	 *    linkType[1, 1]
	 *    predecessor[1, 1]
	 *    successor[1, 1]
	 */
	protected void sequence_WorkSequence(EObject context, WorkSequence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PDLXPackage.Literals.WORK_SEQUENCE__LINK_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLXPackage.Literals.WORK_SEQUENCE__LINK_TYPE));
			if(transientValues.isValueTransient(semanticObject, PDLXPackage.Literals.WORK_SEQUENCE__PREDECESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLXPackage.Literals.WORK_SEQUENCE__PREDECESSOR));
			if(transientValues.isValueTransient(semanticObject, PDLXPackage.Literals.WORK_SEQUENCE__SUCCESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLXPackage.Literals.WORK_SEQUENCE__SUCCESSOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0(), semanticObject.getLinkType());
		feeder.accept(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1(), semanticObject.getPredecessor());
		feeder.accept(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1(), semanticObject.getSuccessor());
		feeder.finish();
	}
}
