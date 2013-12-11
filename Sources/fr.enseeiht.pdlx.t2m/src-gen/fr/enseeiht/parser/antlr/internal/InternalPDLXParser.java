package fr.enseeiht.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.enseeiht.services.PDLXGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDLXParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'}'", "'wd'", "'r'", "'('", "')'", "'n'", "'set'", "'ws'", "'from'", "'to'", "'s2s'", "'f2s'", "'s2f'", "'f2f'"
    };
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalPDLXParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDLXParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDLXParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g"; }



     	private PDLXGrammarAccess grammarAccess;
     	
        public InternalPDLXParser(TokenStream input, PDLXGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Process";	
       	}
       	
       	@Override
       	protected PDLXGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProcess"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:68:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:69:2: (iv_ruleProcess= ruleProcess EOF )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:70:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess75);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:77:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_processElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:80:28: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:81:1: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:81:1: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:81:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProcess122); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
                
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:86:1: (lv_name_1_0= RULE_ID )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcess139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProcess156); 

                	newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:107:1: ( (lv_processElements_3_0= ruleProcessElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||(LA1_0>=14 && LA1_0<=15)||(LA1_0>=18 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:108:1: (lv_processElements_3_0= ruleProcessElement )
            	    {
            	    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:108:1: (lv_processElements_3_0= ruleProcessElement )
            	    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:109:3: lv_processElements_3_0= ruleProcessElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessElement_in_ruleProcess177);
            	    lv_processElements_3_0=ruleProcessElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"processElements",
            	            		lv_processElements_3_0, 
            	            		"ProcessElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleProcess190); 

                	newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:137:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:138:2: (iv_ruleProcessElement= ruleProcessElement EOF )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:139:2: iv_ruleProcessElement= ruleProcessElement EOF
            {
             newCompositeNode(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_ruleProcessElement_in_entryRuleProcessElement226);
            iv_ruleProcessElement=ruleProcessElement();

            state._fsp--;

             current =iv_ruleProcessElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessElement236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:146:1: ruleProcessElement returns [EObject current=null] : (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressource_3= ruleRessource | this_Need_4= ruleNeed | this_NeedSet_5= ruleNeedSet ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_WorkDefinition_0 = null;

        EObject this_WorkSequence_1 = null;

        EObject this_Guidance_2 = null;

        EObject this_Ressource_3 = null;

        EObject this_Need_4 = null;

        EObject this_NeedSet_5 = null;


         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:149:28: ( (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressource_3= ruleRessource | this_Need_4= ruleNeed | this_NeedSet_5= ruleNeedSet ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:150:1: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressource_3= ruleRessource | this_Need_4= ruleNeed | this_NeedSet_5= ruleNeedSet )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:150:1: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressource_3= ruleRessource | this_Need_4= ruleNeed | this_NeedSet_5= ruleNeedSet )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            case 19:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:151:5: this_WorkDefinition_0= ruleWorkDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWorkDefinition_in_ruleProcessElement283);
                    this_WorkDefinition_0=ruleWorkDefinition();

                    state._fsp--;

                     
                            current = this_WorkDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:161:5: this_WorkSequence_1= ruleWorkSequence
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWorkSequence_in_ruleProcessElement310);
                    this_WorkSequence_1=ruleWorkSequence();

                    state._fsp--;

                     
                            current = this_WorkSequence_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:171:5: this_Guidance_2= ruleGuidance
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGuidance_in_ruleProcessElement337);
                    this_Guidance_2=ruleGuidance();

                    state._fsp--;

                     
                            current = this_Guidance_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:181:5: this_Ressource_3= ruleRessource
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRessource_in_ruleProcessElement364);
                    this_Ressource_3=ruleRessource();

                    state._fsp--;

                     
                            current = this_Ressource_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:191:5: this_Need_4= ruleNeed
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementAccess().getNeedParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleNeed_in_ruleProcessElement391);
                    this_Need_4=ruleNeed();

                    state._fsp--;

                     
                            current = this_Need_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:201:5: this_NeedSet_5= ruleNeedSet
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementAccess().getNeedSetParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleNeedSet_in_ruleProcessElement418);
                    this_NeedSet_5=ruleNeedSet();

                    state._fsp--;

                     
                            current = this_NeedSet_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:217:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:218:2: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:219:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_ruleWorkDefinition_in_entryRuleWorkDefinition453);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkDefinition463); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:226:1: ruleWorkDefinition returns [EObject current=null] : (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:229:28: ( (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:230:1: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:230:1: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:230:3: otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleWorkDefinition500); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWdKeyword_0());
                
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:234:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:235:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:235:1: (lv_name_1_0= RULE_ID )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:236:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkDefinition517); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleRessource"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:260:1: entryRuleRessource returns [EObject current=null] : iv_ruleRessource= ruleRessource EOF ;
    public final EObject entryRuleRessource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessource = null;


        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:261:2: (iv_ruleRessource= ruleRessource EOF )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:262:2: iv_ruleRessource= ruleRessource EOF
            {
             newCompositeNode(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_ruleRessource_in_entryRuleRessource558);
            iv_ruleRessource=ruleRessource();

            state._fsp--;

             current =iv_ruleRessource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRessource568); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:269:1: ruleRessource returns [EObject current=null] : (otherlv_0= 'r' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleRessource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_quantity_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:272:28: ( (otherlv_0= 'r' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:273:1: (otherlv_0= 'r' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:273:1: (otherlv_0= 'r' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ')' )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:273:3: otherlv_0= 'r' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleRessource605); 

                	newLeafNode(otherlv_0, grammarAccess.getRessourceAccess().getRKeyword_0());
                
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:277:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:278:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:278:1: (lv_name_1_0= RULE_ID )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:279:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRessource622); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRessourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRessource639); 

                	newLeafNode(otherlv_2, grammarAccess.getRessourceAccess().getLeftParenthesisKeyword_2());
                
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:299:1: ( (lv_quantity_3_0= RULE_INT ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:300:1: (lv_quantity_3_0= RULE_INT )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:300:1: (lv_quantity_3_0= RULE_INT )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:301:3: lv_quantity_3_0= RULE_INT
            {
            lv_quantity_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRessource656); 

            			newLeafNode(lv_quantity_3_0, grammarAccess.getRessourceAccess().getQuantityINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRessourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"quantity",
                    		lv_quantity_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleRessource673); 

                	newLeafNode(otherlv_4, grammarAccess.getRessourceAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleNeed"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:329:1: entryRuleNeed returns [EObject current=null] : iv_ruleNeed= ruleNeed EOF ;
    public final EObject entryRuleNeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeed = null;


        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:330:2: (iv_ruleNeed= ruleNeed EOF )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:331:2: iv_ruleNeed= ruleNeed EOF
            {
             newCompositeNode(grammarAccess.getNeedRule()); 
            pushFollow(FOLLOW_ruleNeed_in_entryRuleNeed709);
            iv_ruleNeed=ruleNeed();

            state._fsp--;

             current =iv_ruleNeed; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNeed719); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNeed"


    // $ANTLR start "ruleNeed"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:338:1: ruleNeed returns [EObject current=null] : (otherlv_0= 'n' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= 'set' ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleNeed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_quantity_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:341:28: ( (otherlv_0= 'n' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= 'set' ( (otherlv_6= RULE_ID ) ) ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:342:1: (otherlv_0= 'n' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= 'set' ( (otherlv_6= RULE_ID ) ) )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:342:1: (otherlv_0= 'n' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= 'set' ( (otherlv_6= RULE_ID ) ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:342:3: otherlv_0= 'n' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= 'set' ( (otherlv_6= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleNeed756); 

                	newLeafNode(otherlv_0, grammarAccess.getNeedAccess().getNKeyword_0());
                
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:346:1: ( (otherlv_1= RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:347:1: (otherlv_1= RULE_ID )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:347:1: (otherlv_1= RULE_ID )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:348:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNeedRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNeed776); 

            		newLeafNode(otherlv_1, grammarAccess.getNeedAccess().getRessourceRessourceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleNeed788); 

                	newLeafNode(otherlv_2, grammarAccess.getNeedAccess().getLeftParenthesisKeyword_2());
                
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:363:1: ( (lv_quantity_3_0= RULE_INT ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:364:1: (lv_quantity_3_0= RULE_INT )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:364:1: (lv_quantity_3_0= RULE_INT )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:365:3: lv_quantity_3_0= RULE_INT
            {
            lv_quantity_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNeed805); 

            			newLeafNode(lv_quantity_3_0, grammarAccess.getNeedAccess().getQuantityINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNeedRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"quantity",
                    		lv_quantity_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleNeed822); 

                	newLeafNode(otherlv_4, grammarAccess.getNeedAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleNeed834); 

                	newLeafNode(otherlv_5, grammarAccess.getNeedAccess().getSetKeyword_5());
                
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:389:1: ( (otherlv_6= RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:390:1: (otherlv_6= RULE_ID )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:390:1: (otherlv_6= RULE_ID )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:391:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNeedRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNeed854); 

            		newLeafNode(otherlv_6, grammarAccess.getNeedAccess().getNeedSetNeedSetCrossReference_6_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNeed"


    // $ANTLR start "entryRuleNeedSet"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:410:1: entryRuleNeedSet returns [EObject current=null] : iv_ruleNeedSet= ruleNeedSet EOF ;
    public final EObject entryRuleNeedSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeedSet = null;


        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:411:2: (iv_ruleNeedSet= ruleNeedSet EOF )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:412:2: iv_ruleNeedSet= ruleNeedSet EOF
            {
             newCompositeNode(grammarAccess.getNeedSetRule()); 
            pushFollow(FOLLOW_ruleNeedSet_in_entryRuleNeedSet890);
            iv_ruleNeedSet=ruleNeedSet();

            state._fsp--;

             current =iv_ruleNeedSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNeedSet900); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNeedSet"


    // $ANTLR start "ruleNeedSet"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:419:1: ruleNeedSet returns [EObject current=null] : (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'wd' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleNeedSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:422:28: ( (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'wd' ( (otherlv_3= RULE_ID ) ) ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:423:1: (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'wd' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:423:1: (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'wd' ( (otherlv_3= RULE_ID ) ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:423:3: otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'wd' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleNeedSet937); 

                	newLeafNode(otherlv_0, grammarAccess.getNeedSetAccess().getSetKeyword_0());
                
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:427:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:428:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:428:1: (lv_name_1_0= RULE_ID )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:429:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNeedSet954); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNeedSetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNeedSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleNeedSet971); 

                	newLeafNode(otherlv_2, grammarAccess.getNeedSetAccess().getWdKeyword_2());
                
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:449:1: ( (otherlv_3= RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:450:1: (otherlv_3= RULE_ID )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:450:1: (otherlv_3= RULE_ID )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:451:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNeedSetRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNeedSet991); 

            		newLeafNode(otherlv_3, grammarAccess.getNeedSetAccess().getWdWorkDefinitionCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNeedSet"


    // $ANTLR start "entryRuleWorkSequence"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:470:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:471:2: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:472:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_ruleWorkSequence_in_entryRuleWorkSequence1027);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSequence1037); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:479:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_linkType_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:482:28: ( (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:483:1: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:483:1: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:483:3: otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleWorkSequence1074); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWsKeyword_0());
                
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:487:1: ( (lv_linkType_1_0= ruleWorkSequenceType ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:488:1: (lv_linkType_1_0= ruleWorkSequenceType )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:488:1: (lv_linkType_1_0= ruleWorkSequenceType )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:489:3: lv_linkType_1_0= ruleWorkSequenceType
            {
             
            	        newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleWorkSequenceType_in_ruleWorkSequence1095);
            lv_linkType_1_0=ruleWorkSequenceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            	        }
                   		set(
                   			current, 
                   			"linkType",
                    		lv_linkType_1_0, 
                    		"WorkSequenceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleWorkSequence1107); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getFromKeyword_2());
                
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:509:1: ( (otherlv_3= RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:510:1: (otherlv_3= RULE_ID )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:510:1: (otherlv_3= RULE_ID )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:511:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkSequenceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSequence1127); 

            		newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleWorkSequence1139); 

                	newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getToKeyword_4());
                
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:526:1: ( (otherlv_5= RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:527:1: (otherlv_5= RULE_ID )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:527:1: (otherlv_5= RULE_ID )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:528:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkSequenceRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSequence1159); 

            		newLeafNode(otherlv_5, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:547:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:548:2: (iv_ruleGuidance= ruleGuidance EOF )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:549:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_ruleGuidance_in_entryRuleGuidance1195);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuidance1205); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:556:1: ruleGuidance returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:559:28: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:560:1: ( (lv_text_0_0= RULE_STRING ) )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:560:1: ( (lv_text_0_0= RULE_STRING ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:561:1: (lv_text_0_0= RULE_STRING )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:561:1: (lv_text_0_0= RULE_STRING )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:562:3: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGuidance1246); 

            			newLeafNode(lv_text_0_0, grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuidanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "ruleWorkSequenceType"
    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:586:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:588:28: ( ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) )
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:589:1: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            {
            // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:589:1: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 26:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:589:2: (enumLiteral_0= 's2s' )
                    {
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:589:2: (enumLiteral_0= 's2s' )
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:589:4: enumLiteral_0= 's2s'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleWorkSequenceType1300); 

                            current = grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:595:6: (enumLiteral_1= 'f2s' )
                    {
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:595:6: (enumLiteral_1= 'f2s' )
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:595:8: enumLiteral_1= 'f2s'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleWorkSequenceType1317); 

                            current = grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:601:6: (enumLiteral_2= 's2f' )
                    {
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:601:6: (enumLiteral_2= 's2f' )
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:601:8: enumLiteral_2= 's2f'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_25_in_ruleWorkSequenceType1334); 

                            current = grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:607:6: (enumLiteral_3= 'f2f' )
                    {
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:607:6: (enumLiteral_3= 'f2f' )
                    // ../fr.enseeiht.pdlx.t2m/src-gen/fr/enseeiht/parser/antlr/internal/InternalPDLX.g:607:8: enumLiteral_3= 'f2f'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_26_in_ruleWorkSequenceType1351); 

                            current = grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProcess122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcess139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcess156 = new BitSet(new long[]{0x00000000001CE040L});
    public static final BitSet FOLLOW_ruleProcessElement_in_ruleProcess177 = new BitSet(new long[]{0x00000000001CE040L});
    public static final BitSet FOLLOW_13_in_ruleProcess190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessElement_in_entryRuleProcessElement226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessElement236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkDefinition_in_ruleProcessElement283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequence_in_ruleProcessElement310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_ruleProcessElement337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRessource_in_ruleProcessElement364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeed_in_ruleProcessElement391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeedSet_in_ruleProcessElement418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkDefinition_in_entryRuleWorkDefinition453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkDefinition463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleWorkDefinition500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkDefinition517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRessource_in_entryRuleRessource558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRessource568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRessource605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRessource622 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRessource639 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRessource656 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRessource673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeed_in_entryRuleNeed709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNeed719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNeed756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNeed776 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNeed788 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNeed805 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNeed822 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNeed834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNeed854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeedSet_in_entryRuleNeedSet890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNeedSet900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNeedSet937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNeedSet954 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNeedSet971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNeedSet991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequence_in_entryRuleWorkSequence1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSequence1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleWorkSequence1074 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_ruleWorkSequenceType_in_ruleWorkSequence1095 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleWorkSequence1107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSequence1127 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleWorkSequence1139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSequence1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_entryRuleGuidance1195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuidance1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGuidance1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleWorkSequenceType1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleWorkSequenceType1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleWorkSequenceType1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleWorkSequenceType1351 = new BitSet(new long[]{0x0000000000000002L});

}