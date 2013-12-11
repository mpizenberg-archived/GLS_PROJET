package fr.enseeiht.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.enseeiht.services.PDLXGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDLXParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s2s'", "'f2s'", "'s2f'", "'f2f'", "'process'", "'{'", "'}'", "'wd'", "'r'", "'('", "')'", "'n'", "'set'", "'ws'", "'from'", "'to'"
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
    public String getGrammarFileName() { return "../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g"; }


     
     	private PDLXGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PDLXGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleProcess"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:60:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:61:1: ( ruleProcess EOF )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:62:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess61);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:69:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:73:2: ( ( ( rule__Process__Group__0 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:74:1: ( ( rule__Process__Group__0 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:74:1: ( ( rule__Process__Group__0 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:75:1: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:76:1: ( rule__Process__Group__0 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:76:2: rule__Process__Group__0
            {
            pushFollow(FOLLOW_rule__Process__Group__0_in_ruleProcess94);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:88:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:89:1: ( ruleProcessElement EOF )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:90:1: ruleProcessElement EOF
            {
             before(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_ruleProcessElement_in_entryRuleProcessElement121);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessElement128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:97:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:101:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:102:1: ( ( rule__ProcessElement__Alternatives ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:102:1: ( ( rule__ProcessElement__Alternatives ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:103:1: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:104:1: ( rule__ProcessElement__Alternatives )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:104:2: rule__ProcessElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ProcessElement__Alternatives_in_ruleProcessElement154);
            rule__ProcessElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:116:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:117:1: ( ruleWorkDefinition EOF )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:118:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_ruleWorkDefinition_in_entryRuleWorkDefinition181);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkDefinition188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:125:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:129:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:130:1: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:130:1: ( ( rule__WorkDefinition__Group__0 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:131:1: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:132:1: ( rule__WorkDefinition__Group__0 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:132:2: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group__0_in_ruleWorkDefinition214);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleRessource"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:144:1: entryRuleRessource : ruleRessource EOF ;
    public final void entryRuleRessource() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:145:1: ( ruleRessource EOF )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:146:1: ruleRessource EOF
            {
             before(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_ruleRessource_in_entryRuleRessource241);
            ruleRessource();

            state._fsp--;

             after(grammarAccess.getRessourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRessource248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:153:1: ruleRessource : ( ( rule__Ressource__Group__0 ) ) ;
    public final void ruleRessource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:157:2: ( ( ( rule__Ressource__Group__0 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:158:1: ( ( rule__Ressource__Group__0 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:158:1: ( ( rule__Ressource__Group__0 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:159:1: ( rule__Ressource__Group__0 )
            {
             before(grammarAccess.getRessourceAccess().getGroup()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:160:1: ( rule__Ressource__Group__0 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:160:2: rule__Ressource__Group__0
            {
            pushFollow(FOLLOW_rule__Ressource__Group__0_in_ruleRessource274);
            rule__Ressource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleNeed"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:172:1: entryRuleNeed : ruleNeed EOF ;
    public final void entryRuleNeed() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:173:1: ( ruleNeed EOF )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:174:1: ruleNeed EOF
            {
             before(grammarAccess.getNeedRule()); 
            pushFollow(FOLLOW_ruleNeed_in_entryRuleNeed301);
            ruleNeed();

            state._fsp--;

             after(grammarAccess.getNeedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNeed308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNeed"


    // $ANTLR start "ruleNeed"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:181:1: ruleNeed : ( ( rule__Need__Group__0 ) ) ;
    public final void ruleNeed() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:185:2: ( ( ( rule__Need__Group__0 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:186:1: ( ( rule__Need__Group__0 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:186:1: ( ( rule__Need__Group__0 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:187:1: ( rule__Need__Group__0 )
            {
             before(grammarAccess.getNeedAccess().getGroup()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:188:1: ( rule__Need__Group__0 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:188:2: rule__Need__Group__0
            {
            pushFollow(FOLLOW_rule__Need__Group__0_in_ruleNeed334);
            rule__Need__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNeed"


    // $ANTLR start "entryRuleNeedSet"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:200:1: entryRuleNeedSet : ruleNeedSet EOF ;
    public final void entryRuleNeedSet() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:201:1: ( ruleNeedSet EOF )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:202:1: ruleNeedSet EOF
            {
             before(grammarAccess.getNeedSetRule()); 
            pushFollow(FOLLOW_ruleNeedSet_in_entryRuleNeedSet361);
            ruleNeedSet();

            state._fsp--;

             after(grammarAccess.getNeedSetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNeedSet368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNeedSet"


    // $ANTLR start "ruleNeedSet"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:209:1: ruleNeedSet : ( ( rule__NeedSet__Group__0 ) ) ;
    public final void ruleNeedSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:213:2: ( ( ( rule__NeedSet__Group__0 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:214:1: ( ( rule__NeedSet__Group__0 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:214:1: ( ( rule__NeedSet__Group__0 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:215:1: ( rule__NeedSet__Group__0 )
            {
             before(grammarAccess.getNeedSetAccess().getGroup()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:216:1: ( rule__NeedSet__Group__0 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:216:2: rule__NeedSet__Group__0
            {
            pushFollow(FOLLOW_rule__NeedSet__Group__0_in_ruleNeedSet394);
            rule__NeedSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNeedSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNeedSet"


    // $ANTLR start "entryRuleWorkSequence"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:228:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:229:1: ( ruleWorkSequence EOF )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:230:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_ruleWorkSequence_in_entryRuleWorkSequence421);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSequence428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:237:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:241:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:242:1: ( ( rule__WorkSequence__Group__0 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:242:1: ( ( rule__WorkSequence__Group__0 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:243:1: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:244:1: ( rule__WorkSequence__Group__0 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:244:2: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_rule__WorkSequence__Group__0_in_ruleWorkSequence454);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:256:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:257:1: ( ruleGuidance EOF )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:258:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_ruleGuidance_in_entryRuleGuidance481);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuidance488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:265:1: ruleGuidance : ( ( rule__Guidance__TextAssignment ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:269:2: ( ( ( rule__Guidance__TextAssignment ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:270:1: ( ( rule__Guidance__TextAssignment ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:270:1: ( ( rule__Guidance__TextAssignment ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:271:1: ( rule__Guidance__TextAssignment )
            {
             before(grammarAccess.getGuidanceAccess().getTextAssignment()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:272:1: ( rule__Guidance__TextAssignment )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:272:2: rule__Guidance__TextAssignment
            {
            pushFollow(FOLLOW_rule__Guidance__TextAssignment_in_ruleGuidance514);
            rule__Guidance__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "ruleWorkSequenceType"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:285:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:289:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:290:1: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:290:1: ( ( rule__WorkSequenceType__Alternatives ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:291:1: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:292:1: ( rule__WorkSequenceType__Alternatives )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:292:2: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_rule__WorkSequenceType__Alternatives_in_ruleWorkSequenceType551);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:303:1: rule__ProcessElement__Alternatives : ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessource ) | ( ruleNeed ) | ( ruleNeedSet ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:307:1: ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessource ) | ( ruleNeed ) | ( ruleNeedSet ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
                {
                alt1=3;
                }
                break;
            case 19:
                {
                alt1=4;
                }
                break;
            case 22:
                {
                alt1=5;
                }
                break;
            case 23:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:308:1: ( ruleWorkDefinition )
                    {
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:308:1: ( ruleWorkDefinition )
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:309:1: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWorkDefinition_in_rule__ProcessElement__Alternatives586);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:314:6: ( ruleWorkSequence )
                    {
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:314:6: ( ruleWorkSequence )
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:315:1: ruleWorkSequence
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleWorkSequence_in_rule__ProcessElement__Alternatives603);
                    ruleWorkSequence();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:320:6: ( ruleGuidance )
                    {
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:320:6: ( ruleGuidance )
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:321:1: ruleGuidance
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGuidance_in_rule__ProcessElement__Alternatives620);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:326:6: ( ruleRessource )
                    {
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:326:6: ( ruleRessource )
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:327:1: ruleRessource
                    {
                     before(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRessource_in_rule__ProcessElement__Alternatives637);
                    ruleRessource();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:332:6: ( ruleNeed )
                    {
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:332:6: ( ruleNeed )
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:333:1: ruleNeed
                    {
                     before(grammarAccess.getProcessElementAccess().getNeedParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleNeed_in_rule__ProcessElement__Alternatives654);
                    ruleNeed();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getNeedParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:338:6: ( ruleNeedSet )
                    {
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:338:6: ( ruleNeedSet )
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:339:1: ruleNeedSet
                    {
                     before(grammarAccess.getProcessElementAccess().getNeedSetParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleNeedSet_in_rule__ProcessElement__Alternatives671);
                    ruleNeedSet();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getNeedSetParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessElement__Alternatives"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:349:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:353:1: ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:354:1: ( ( 's2s' ) )
                    {
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:354:1: ( ( 's2s' ) )
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:355:1: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:356:1: ( 's2s' )
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:356:3: 's2s'
                    {
                    match(input,11,FOLLOW_11_in_rule__WorkSequenceType__Alternatives704); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:361:6: ( ( 'f2s' ) )
                    {
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:361:6: ( ( 'f2s' ) )
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:362:1: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:363:1: ( 'f2s' )
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:363:3: 'f2s'
                    {
                    match(input,12,FOLLOW_12_in_rule__WorkSequenceType__Alternatives725); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:368:6: ( ( 's2f' ) )
                    {
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:368:6: ( ( 's2f' ) )
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:369:1: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:370:1: ( 's2f' )
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:370:3: 's2f'
                    {
                    match(input,13,FOLLOW_13_in_rule__WorkSequenceType__Alternatives746); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:375:6: ( ( 'f2f' ) )
                    {
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:375:6: ( ( 'f2f' ) )
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:376:1: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:377:1: ( 'f2f' )
                    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:377:3: 'f2f'
                    {
                    match(input,14,FOLLOW_14_in_rule__WorkSequenceType__Alternatives767); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:389:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:393:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:394:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_rule__Process__Group__0__Impl_in_rule__Process__Group__0800);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__1_in_rule__Process__Group__0803);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:401:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:405:1: ( ( 'process' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:406:1: ( 'process' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:406:1: ( 'process' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:407:1: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Process__Group__0__Impl831); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:420:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:424:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:425:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_rule__Process__Group__1__Impl_in_rule__Process__Group__1862);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__2_in_rule__Process__Group__1865);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:432:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:436:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:437:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:437:1: ( ( rule__Process__NameAssignment_1 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:438:1: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:439:1: ( rule__Process__NameAssignment_1 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:439:2: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Process__NameAssignment_1_in_rule__Process__Group__1__Impl892);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:449:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:453:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:454:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_rule__Process__Group__2__Impl_in_rule__Process__Group__2922);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__3_in_rule__Process__Group__2925);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:461:1: rule__Process__Group__2__Impl : ( '{' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:465:1: ( ( '{' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:466:1: ( '{' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:466:1: ( '{' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:467:1: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Process__Group__2__Impl953); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:480:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:484:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:485:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_rule__Process__Group__3__Impl_in_rule__Process__Group__3984);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Process__Group__4_in_rule__Process__Group__3987);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:492:1: rule__Process__Group__3__Impl : ( ( rule__Process__ProcessElementsAssignment_3 )* ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:496:1: ( ( ( rule__Process__ProcessElementsAssignment_3 )* ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:497:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:497:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:498:1: ( rule__Process__ProcessElementsAssignment_3 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:499:1: ( rule__Process__ProcessElementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING||(LA3_0>=18 && LA3_0<=19)||(LA3_0>=22 && LA3_0<=24)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:499:2: rule__Process__ProcessElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Process__ProcessElementsAssignment_3_in_rule__Process__Group__3__Impl1014);
            	    rule__Process__ProcessElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:509:1: rule__Process__Group__4 : rule__Process__Group__4__Impl ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:513:1: ( rule__Process__Group__4__Impl )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:514:2: rule__Process__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Process__Group__4__Impl_in_rule__Process__Group__41045);
            rule__Process__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:520:1: rule__Process__Group__4__Impl : ( '}' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:524:1: ( ( '}' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:525:1: ( '}' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:525:1: ( '}' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:526:1: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Process__Group__4__Impl1073); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:549:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:553:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:554:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group__0__Impl_in_rule__WorkDefinition__Group__01114);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkDefinition__Group__1_in_rule__WorkDefinition__Group__01117);
            rule__WorkDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:561:1: rule__WorkDefinition__Group__0__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:565:1: ( ( 'wd' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:566:1: ( 'wd' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:566:1: ( 'wd' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:567:1: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__WorkDefinition__Group__0__Impl1145); 
             after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:580:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:584:1: ( rule__WorkDefinition__Group__1__Impl )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:585:2: rule__WorkDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WorkDefinition__Group__1__Impl_in_rule__WorkDefinition__Group__11176);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:591:1: rule__WorkDefinition__Group__1__Impl : ( ( rule__WorkDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:595:1: ( ( ( rule__WorkDefinition__NameAssignment_1 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:596:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:596:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:597:1: ( rule__WorkDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:598:1: ( rule__WorkDefinition__NameAssignment_1 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:598:2: rule__WorkDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkDefinition__NameAssignment_1_in_rule__WorkDefinition__Group__1__Impl1203);
            rule__WorkDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__Ressource__Group__0"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:612:1: rule__Ressource__Group__0 : rule__Ressource__Group__0__Impl rule__Ressource__Group__1 ;
    public final void rule__Ressource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:616:1: ( rule__Ressource__Group__0__Impl rule__Ressource__Group__1 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:617:2: rule__Ressource__Group__0__Impl rule__Ressource__Group__1
            {
            pushFollow(FOLLOW_rule__Ressource__Group__0__Impl_in_rule__Ressource__Group__01237);
            rule__Ressource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ressource__Group__1_in_rule__Ressource__Group__01240);
            rule__Ressource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__0"


    // $ANTLR start "rule__Ressource__Group__0__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:624:1: rule__Ressource__Group__0__Impl : ( 'r' ) ;
    public final void rule__Ressource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:628:1: ( ( 'r' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:629:1: ( 'r' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:629:1: ( 'r' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:630:1: 'r'
            {
             before(grammarAccess.getRessourceAccess().getRKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Ressource__Group__0__Impl1268); 
             after(grammarAccess.getRessourceAccess().getRKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__0__Impl"


    // $ANTLR start "rule__Ressource__Group__1"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:643:1: rule__Ressource__Group__1 : rule__Ressource__Group__1__Impl rule__Ressource__Group__2 ;
    public final void rule__Ressource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:647:1: ( rule__Ressource__Group__1__Impl rule__Ressource__Group__2 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:648:2: rule__Ressource__Group__1__Impl rule__Ressource__Group__2
            {
            pushFollow(FOLLOW_rule__Ressource__Group__1__Impl_in_rule__Ressource__Group__11299);
            rule__Ressource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ressource__Group__2_in_rule__Ressource__Group__11302);
            rule__Ressource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__1"


    // $ANTLR start "rule__Ressource__Group__1__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:655:1: rule__Ressource__Group__1__Impl : ( ( rule__Ressource__NameAssignment_1 ) ) ;
    public final void rule__Ressource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:659:1: ( ( ( rule__Ressource__NameAssignment_1 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:660:1: ( ( rule__Ressource__NameAssignment_1 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:660:1: ( ( rule__Ressource__NameAssignment_1 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:661:1: ( rule__Ressource__NameAssignment_1 )
            {
             before(grammarAccess.getRessourceAccess().getNameAssignment_1()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:662:1: ( rule__Ressource__NameAssignment_1 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:662:2: rule__Ressource__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Ressource__NameAssignment_1_in_rule__Ressource__Group__1__Impl1329);
            rule__Ressource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__1__Impl"


    // $ANTLR start "rule__Ressource__Group__2"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:672:1: rule__Ressource__Group__2 : rule__Ressource__Group__2__Impl rule__Ressource__Group__3 ;
    public final void rule__Ressource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:676:1: ( rule__Ressource__Group__2__Impl rule__Ressource__Group__3 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:677:2: rule__Ressource__Group__2__Impl rule__Ressource__Group__3
            {
            pushFollow(FOLLOW_rule__Ressource__Group__2__Impl_in_rule__Ressource__Group__21359);
            rule__Ressource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ressource__Group__3_in_rule__Ressource__Group__21362);
            rule__Ressource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__2"


    // $ANTLR start "rule__Ressource__Group__2__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:684:1: rule__Ressource__Group__2__Impl : ( '(' ) ;
    public final void rule__Ressource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:688:1: ( ( '(' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:689:1: ( '(' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:689:1: ( '(' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:690:1: '('
            {
             before(grammarAccess.getRessourceAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Ressource__Group__2__Impl1390); 
             after(grammarAccess.getRessourceAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__2__Impl"


    // $ANTLR start "rule__Ressource__Group__3"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:703:1: rule__Ressource__Group__3 : rule__Ressource__Group__3__Impl rule__Ressource__Group__4 ;
    public final void rule__Ressource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:707:1: ( rule__Ressource__Group__3__Impl rule__Ressource__Group__4 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:708:2: rule__Ressource__Group__3__Impl rule__Ressource__Group__4
            {
            pushFollow(FOLLOW_rule__Ressource__Group__3__Impl_in_rule__Ressource__Group__31421);
            rule__Ressource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ressource__Group__4_in_rule__Ressource__Group__31424);
            rule__Ressource__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__3"


    // $ANTLR start "rule__Ressource__Group__3__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:715:1: rule__Ressource__Group__3__Impl : ( ( rule__Ressource__QuantityAssignment_3 ) ) ;
    public final void rule__Ressource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:719:1: ( ( ( rule__Ressource__QuantityAssignment_3 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:720:1: ( ( rule__Ressource__QuantityAssignment_3 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:720:1: ( ( rule__Ressource__QuantityAssignment_3 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:721:1: ( rule__Ressource__QuantityAssignment_3 )
            {
             before(grammarAccess.getRessourceAccess().getQuantityAssignment_3()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:722:1: ( rule__Ressource__QuantityAssignment_3 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:722:2: rule__Ressource__QuantityAssignment_3
            {
            pushFollow(FOLLOW_rule__Ressource__QuantityAssignment_3_in_rule__Ressource__Group__3__Impl1451);
            rule__Ressource__QuantityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getQuantityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__3__Impl"


    // $ANTLR start "rule__Ressource__Group__4"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:732:1: rule__Ressource__Group__4 : rule__Ressource__Group__4__Impl ;
    public final void rule__Ressource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:736:1: ( rule__Ressource__Group__4__Impl )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:737:2: rule__Ressource__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Ressource__Group__4__Impl_in_rule__Ressource__Group__41481);
            rule__Ressource__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__4"


    // $ANTLR start "rule__Ressource__Group__4__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:743:1: rule__Ressource__Group__4__Impl : ( ')' ) ;
    public final void rule__Ressource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:747:1: ( ( ')' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:748:1: ( ')' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:748:1: ( ')' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:749:1: ')'
            {
             before(grammarAccess.getRessourceAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Ressource__Group__4__Impl1509); 
             after(grammarAccess.getRessourceAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__4__Impl"


    // $ANTLR start "rule__Need__Group__0"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:772:1: rule__Need__Group__0 : rule__Need__Group__0__Impl rule__Need__Group__1 ;
    public final void rule__Need__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:776:1: ( rule__Need__Group__0__Impl rule__Need__Group__1 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:777:2: rule__Need__Group__0__Impl rule__Need__Group__1
            {
            pushFollow(FOLLOW_rule__Need__Group__0__Impl_in_rule__Need__Group__01550);
            rule__Need__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Need__Group__1_in_rule__Need__Group__01553);
            rule__Need__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__0"


    // $ANTLR start "rule__Need__Group__0__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:784:1: rule__Need__Group__0__Impl : ( 'n' ) ;
    public final void rule__Need__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:788:1: ( ( 'n' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:789:1: ( 'n' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:789:1: ( 'n' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:790:1: 'n'
            {
             before(grammarAccess.getNeedAccess().getNKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Need__Group__0__Impl1581); 
             after(grammarAccess.getNeedAccess().getNKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__0__Impl"


    // $ANTLR start "rule__Need__Group__1"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:803:1: rule__Need__Group__1 : rule__Need__Group__1__Impl rule__Need__Group__2 ;
    public final void rule__Need__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:807:1: ( rule__Need__Group__1__Impl rule__Need__Group__2 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:808:2: rule__Need__Group__1__Impl rule__Need__Group__2
            {
            pushFollow(FOLLOW_rule__Need__Group__1__Impl_in_rule__Need__Group__11612);
            rule__Need__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Need__Group__2_in_rule__Need__Group__11615);
            rule__Need__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__1"


    // $ANTLR start "rule__Need__Group__1__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:815:1: rule__Need__Group__1__Impl : ( ( rule__Need__RessourceAssignment_1 ) ) ;
    public final void rule__Need__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:819:1: ( ( ( rule__Need__RessourceAssignment_1 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:820:1: ( ( rule__Need__RessourceAssignment_1 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:820:1: ( ( rule__Need__RessourceAssignment_1 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:821:1: ( rule__Need__RessourceAssignment_1 )
            {
             before(grammarAccess.getNeedAccess().getRessourceAssignment_1()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:822:1: ( rule__Need__RessourceAssignment_1 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:822:2: rule__Need__RessourceAssignment_1
            {
            pushFollow(FOLLOW_rule__Need__RessourceAssignment_1_in_rule__Need__Group__1__Impl1642);
            rule__Need__RessourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getRessourceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__1__Impl"


    // $ANTLR start "rule__Need__Group__2"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:832:1: rule__Need__Group__2 : rule__Need__Group__2__Impl rule__Need__Group__3 ;
    public final void rule__Need__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:836:1: ( rule__Need__Group__2__Impl rule__Need__Group__3 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:837:2: rule__Need__Group__2__Impl rule__Need__Group__3
            {
            pushFollow(FOLLOW_rule__Need__Group__2__Impl_in_rule__Need__Group__21672);
            rule__Need__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Need__Group__3_in_rule__Need__Group__21675);
            rule__Need__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__2"


    // $ANTLR start "rule__Need__Group__2__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:844:1: rule__Need__Group__2__Impl : ( '(' ) ;
    public final void rule__Need__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:848:1: ( ( '(' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:849:1: ( '(' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:849:1: ( '(' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:850:1: '('
            {
             before(grammarAccess.getNeedAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Need__Group__2__Impl1703); 
             after(grammarAccess.getNeedAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__2__Impl"


    // $ANTLR start "rule__Need__Group__3"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:863:1: rule__Need__Group__3 : rule__Need__Group__3__Impl rule__Need__Group__4 ;
    public final void rule__Need__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:867:1: ( rule__Need__Group__3__Impl rule__Need__Group__4 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:868:2: rule__Need__Group__3__Impl rule__Need__Group__4
            {
            pushFollow(FOLLOW_rule__Need__Group__3__Impl_in_rule__Need__Group__31734);
            rule__Need__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Need__Group__4_in_rule__Need__Group__31737);
            rule__Need__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__3"


    // $ANTLR start "rule__Need__Group__3__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:875:1: rule__Need__Group__3__Impl : ( ( rule__Need__QuantityAssignment_3 ) ) ;
    public final void rule__Need__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:879:1: ( ( ( rule__Need__QuantityAssignment_3 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:880:1: ( ( rule__Need__QuantityAssignment_3 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:880:1: ( ( rule__Need__QuantityAssignment_3 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:881:1: ( rule__Need__QuantityAssignment_3 )
            {
             before(grammarAccess.getNeedAccess().getQuantityAssignment_3()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:882:1: ( rule__Need__QuantityAssignment_3 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:882:2: rule__Need__QuantityAssignment_3
            {
            pushFollow(FOLLOW_rule__Need__QuantityAssignment_3_in_rule__Need__Group__3__Impl1764);
            rule__Need__QuantityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getQuantityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__3__Impl"


    // $ANTLR start "rule__Need__Group__4"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:892:1: rule__Need__Group__4 : rule__Need__Group__4__Impl rule__Need__Group__5 ;
    public final void rule__Need__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:896:1: ( rule__Need__Group__4__Impl rule__Need__Group__5 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:897:2: rule__Need__Group__4__Impl rule__Need__Group__5
            {
            pushFollow(FOLLOW_rule__Need__Group__4__Impl_in_rule__Need__Group__41794);
            rule__Need__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Need__Group__5_in_rule__Need__Group__41797);
            rule__Need__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__4"


    // $ANTLR start "rule__Need__Group__4__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:904:1: rule__Need__Group__4__Impl : ( ')' ) ;
    public final void rule__Need__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:908:1: ( ( ')' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:909:1: ( ')' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:909:1: ( ')' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:910:1: ')'
            {
             before(grammarAccess.getNeedAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Need__Group__4__Impl1825); 
             after(grammarAccess.getNeedAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__4__Impl"


    // $ANTLR start "rule__Need__Group__5"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:923:1: rule__Need__Group__5 : rule__Need__Group__5__Impl rule__Need__Group__6 ;
    public final void rule__Need__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:927:1: ( rule__Need__Group__5__Impl rule__Need__Group__6 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:928:2: rule__Need__Group__5__Impl rule__Need__Group__6
            {
            pushFollow(FOLLOW_rule__Need__Group__5__Impl_in_rule__Need__Group__51856);
            rule__Need__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Need__Group__6_in_rule__Need__Group__51859);
            rule__Need__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__5"


    // $ANTLR start "rule__Need__Group__5__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:935:1: rule__Need__Group__5__Impl : ( 'set' ) ;
    public final void rule__Need__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:939:1: ( ( 'set' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:940:1: ( 'set' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:940:1: ( 'set' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:941:1: 'set'
            {
             before(grammarAccess.getNeedAccess().getSetKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Need__Group__5__Impl1887); 
             after(grammarAccess.getNeedAccess().getSetKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__5__Impl"


    // $ANTLR start "rule__Need__Group__6"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:954:1: rule__Need__Group__6 : rule__Need__Group__6__Impl ;
    public final void rule__Need__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:958:1: ( rule__Need__Group__6__Impl )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:959:2: rule__Need__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Need__Group__6__Impl_in_rule__Need__Group__61918);
            rule__Need__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__6"


    // $ANTLR start "rule__Need__Group__6__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:965:1: rule__Need__Group__6__Impl : ( ( rule__Need__NeedSetAssignment_6 ) ) ;
    public final void rule__Need__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:969:1: ( ( ( rule__Need__NeedSetAssignment_6 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:970:1: ( ( rule__Need__NeedSetAssignment_6 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:970:1: ( ( rule__Need__NeedSetAssignment_6 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:971:1: ( rule__Need__NeedSetAssignment_6 )
            {
             before(grammarAccess.getNeedAccess().getNeedSetAssignment_6()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:972:1: ( rule__Need__NeedSetAssignment_6 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:972:2: rule__Need__NeedSetAssignment_6
            {
            pushFollow(FOLLOW_rule__Need__NeedSetAssignment_6_in_rule__Need__Group__6__Impl1945);
            rule__Need__NeedSetAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getNeedSetAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__6__Impl"


    // $ANTLR start "rule__NeedSet__Group__0"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:996:1: rule__NeedSet__Group__0 : rule__NeedSet__Group__0__Impl rule__NeedSet__Group__1 ;
    public final void rule__NeedSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1000:1: ( rule__NeedSet__Group__0__Impl rule__NeedSet__Group__1 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1001:2: rule__NeedSet__Group__0__Impl rule__NeedSet__Group__1
            {
            pushFollow(FOLLOW_rule__NeedSet__Group__0__Impl_in_rule__NeedSet__Group__01989);
            rule__NeedSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NeedSet__Group__1_in_rule__NeedSet__Group__01992);
            rule__NeedSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeedSet__Group__0"


    // $ANTLR start "rule__NeedSet__Group__0__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1008:1: rule__NeedSet__Group__0__Impl : ( 'set' ) ;
    public final void rule__NeedSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1012:1: ( ( 'set' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1013:1: ( 'set' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1013:1: ( 'set' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1014:1: 'set'
            {
             before(grammarAccess.getNeedSetAccess().getSetKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__NeedSet__Group__0__Impl2020); 
             after(grammarAccess.getNeedSetAccess().getSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeedSet__Group__0__Impl"


    // $ANTLR start "rule__NeedSet__Group__1"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1027:1: rule__NeedSet__Group__1 : rule__NeedSet__Group__1__Impl rule__NeedSet__Group__2 ;
    public final void rule__NeedSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1031:1: ( rule__NeedSet__Group__1__Impl rule__NeedSet__Group__2 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1032:2: rule__NeedSet__Group__1__Impl rule__NeedSet__Group__2
            {
            pushFollow(FOLLOW_rule__NeedSet__Group__1__Impl_in_rule__NeedSet__Group__12051);
            rule__NeedSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NeedSet__Group__2_in_rule__NeedSet__Group__12054);
            rule__NeedSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeedSet__Group__1"


    // $ANTLR start "rule__NeedSet__Group__1__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1039:1: rule__NeedSet__Group__1__Impl : ( ( rule__NeedSet__NameAssignment_1 ) ) ;
    public final void rule__NeedSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1043:1: ( ( ( rule__NeedSet__NameAssignment_1 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1044:1: ( ( rule__NeedSet__NameAssignment_1 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1044:1: ( ( rule__NeedSet__NameAssignment_1 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1045:1: ( rule__NeedSet__NameAssignment_1 )
            {
             before(grammarAccess.getNeedSetAccess().getNameAssignment_1()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1046:1: ( rule__NeedSet__NameAssignment_1 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1046:2: rule__NeedSet__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NeedSet__NameAssignment_1_in_rule__NeedSet__Group__1__Impl2081);
            rule__NeedSet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNeedSetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeedSet__Group__1__Impl"


    // $ANTLR start "rule__NeedSet__Group__2"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1056:1: rule__NeedSet__Group__2 : rule__NeedSet__Group__2__Impl rule__NeedSet__Group__3 ;
    public final void rule__NeedSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1060:1: ( rule__NeedSet__Group__2__Impl rule__NeedSet__Group__3 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1061:2: rule__NeedSet__Group__2__Impl rule__NeedSet__Group__3
            {
            pushFollow(FOLLOW_rule__NeedSet__Group__2__Impl_in_rule__NeedSet__Group__22111);
            rule__NeedSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NeedSet__Group__3_in_rule__NeedSet__Group__22114);
            rule__NeedSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeedSet__Group__2"


    // $ANTLR start "rule__NeedSet__Group__2__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1068:1: rule__NeedSet__Group__2__Impl : ( 'wd' ) ;
    public final void rule__NeedSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1072:1: ( ( 'wd' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1073:1: ( 'wd' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1073:1: ( 'wd' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1074:1: 'wd'
            {
             before(grammarAccess.getNeedSetAccess().getWdKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__NeedSet__Group__2__Impl2142); 
             after(grammarAccess.getNeedSetAccess().getWdKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeedSet__Group__2__Impl"


    // $ANTLR start "rule__NeedSet__Group__3"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1087:1: rule__NeedSet__Group__3 : rule__NeedSet__Group__3__Impl ;
    public final void rule__NeedSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1091:1: ( rule__NeedSet__Group__3__Impl )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1092:2: rule__NeedSet__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NeedSet__Group__3__Impl_in_rule__NeedSet__Group__32173);
            rule__NeedSet__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeedSet__Group__3"


    // $ANTLR start "rule__NeedSet__Group__3__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1098:1: rule__NeedSet__Group__3__Impl : ( ( rule__NeedSet__WdAssignment_3 ) ) ;
    public final void rule__NeedSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1102:1: ( ( ( rule__NeedSet__WdAssignment_3 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1103:1: ( ( rule__NeedSet__WdAssignment_3 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1103:1: ( ( rule__NeedSet__WdAssignment_3 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1104:1: ( rule__NeedSet__WdAssignment_3 )
            {
             before(grammarAccess.getNeedSetAccess().getWdAssignment_3()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1105:1: ( rule__NeedSet__WdAssignment_3 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1105:2: rule__NeedSet__WdAssignment_3
            {
            pushFollow(FOLLOW_rule__NeedSet__WdAssignment_3_in_rule__NeedSet__Group__3__Impl2200);
            rule__NeedSet__WdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNeedSetAccess().getWdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeedSet__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1123:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1127:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1128:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_rule__WorkSequence__Group__0__Impl_in_rule__WorkSequence__Group__02238);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkSequence__Group__1_in_rule__WorkSequence__Group__02241);
            rule__WorkSequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1135:1: rule__WorkSequence__Group__0__Impl : ( 'ws' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1139:1: ( ( 'ws' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1140:1: ( 'ws' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1140:1: ( 'ws' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1141:1: 'ws'
            {
             before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__WorkSequence__Group__0__Impl2269); 
             after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1154:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1158:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1159:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_rule__WorkSequence__Group__1__Impl_in_rule__WorkSequence__Group__12300);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkSequence__Group__2_in_rule__WorkSequence__Group__12303);
            rule__WorkSequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1166:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1170:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1171:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1171:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1172:1: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1173:1: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1173:2: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkSequence__LinkTypeAssignment_1_in_rule__WorkSequence__Group__1__Impl2330);
            rule__WorkSequence__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1183:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1187:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1188:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_rule__WorkSequence__Group__2__Impl_in_rule__WorkSequence__Group__22360);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkSequence__Group__3_in_rule__WorkSequence__Group__22363);
            rule__WorkSequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1195:1: rule__WorkSequence__Group__2__Impl : ( 'from' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1199:1: ( ( 'from' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1200:1: ( 'from' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1200:1: ( 'from' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1201:1: 'from'
            {
             before(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__WorkSequence__Group__2__Impl2391); 
             after(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1214:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1218:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1219:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_rule__WorkSequence__Group__3__Impl_in_rule__WorkSequence__Group__32422);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkSequence__Group__4_in_rule__WorkSequence__Group__32425);
            rule__WorkSequence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1226:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1230:1: ( ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1231:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1231:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1232:1: ( rule__WorkSequence__PredecessorAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1233:1: ( rule__WorkSequence__PredecessorAssignment_3 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1233:2: rule__WorkSequence__PredecessorAssignment_3
            {
            pushFollow(FOLLOW_rule__WorkSequence__PredecessorAssignment_3_in_rule__WorkSequence__Group__3__Impl2452);
            rule__WorkSequence__PredecessorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1243:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1247:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1248:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_rule__WorkSequence__Group__4__Impl_in_rule__WorkSequence__Group__42482);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkSequence__Group__5_in_rule__WorkSequence__Group__42485);
            rule__WorkSequence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1255:1: rule__WorkSequence__Group__4__Impl : ( 'to' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1259:1: ( ( 'to' ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1260:1: ( 'to' )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1260:1: ( 'to' )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1261:1: 'to'
            {
             before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__WorkSequence__Group__4__Impl2513); 
             after(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1274:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1278:1: ( rule__WorkSequence__Group__5__Impl )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1279:2: rule__WorkSequence__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__WorkSequence__Group__5__Impl_in_rule__WorkSequence__Group__52544);
            rule__WorkSequence__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1285:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1289:1: ( ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1290:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1290:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1291:1: ( rule__WorkSequence__SuccessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1292:1: ( rule__WorkSequence__SuccessorAssignment_5 )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1292:2: rule__WorkSequence__SuccessorAssignment_5
            {
            pushFollow(FOLLOW_rule__WorkSequence__SuccessorAssignment_5_in_rule__WorkSequence__Group__5__Impl2571);
            rule__WorkSequence__SuccessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1315:1: rule__Process__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1319:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1320:1: ( RULE_ID )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1320:1: ( RULE_ID )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1321:1: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Process__NameAssignment_12618); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_3"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1330:1: rule__Process__ProcessElementsAssignment_3 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1334:1: ( ( ruleProcessElement ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1335:1: ( ruleProcessElement )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1335:1: ( ruleProcessElement )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1336:1: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProcessElement_in_rule__Process__ProcessElementsAssignment_32649);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ProcessElementsAssignment_3"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_1"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1345:1: rule__WorkDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1349:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1350:1: ( RULE_ID )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1350:1: ( RULE_ID )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1351:1: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkDefinition__NameAssignment_12680); 
             after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__NameAssignment_1"


    // $ANTLR start "rule__Ressource__NameAssignment_1"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1360:1: rule__Ressource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ressource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1364:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1365:1: ( RULE_ID )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1365:1: ( RULE_ID )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1366:1: RULE_ID
            {
             before(grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ressource__NameAssignment_12711); 
             after(grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__NameAssignment_1"


    // $ANTLR start "rule__Ressource__QuantityAssignment_3"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1375:1: rule__Ressource__QuantityAssignment_3 : ( RULE_INT ) ;
    public final void rule__Ressource__QuantityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1379:1: ( ( RULE_INT ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1380:1: ( RULE_INT )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1380:1: ( RULE_INT )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1381:1: RULE_INT
            {
             before(grammarAccess.getRessourceAccess().getQuantityINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Ressource__QuantityAssignment_32742); 
             after(grammarAccess.getRessourceAccess().getQuantityINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__QuantityAssignment_3"


    // $ANTLR start "rule__Need__RessourceAssignment_1"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1390:1: rule__Need__RessourceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Need__RessourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1394:1: ( ( ( RULE_ID ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1395:1: ( ( RULE_ID ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1395:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1396:1: ( RULE_ID )
            {
             before(grammarAccess.getNeedAccess().getRessourceRessourceCrossReference_1_0()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1397:1: ( RULE_ID )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1398:1: RULE_ID
            {
             before(grammarAccess.getNeedAccess().getRessourceRessourceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Need__RessourceAssignment_12777); 
             after(grammarAccess.getNeedAccess().getRessourceRessourceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNeedAccess().getRessourceRessourceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__RessourceAssignment_1"


    // $ANTLR start "rule__Need__QuantityAssignment_3"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1409:1: rule__Need__QuantityAssignment_3 : ( RULE_INT ) ;
    public final void rule__Need__QuantityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1413:1: ( ( RULE_INT ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1414:1: ( RULE_INT )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1414:1: ( RULE_INT )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1415:1: RULE_INT
            {
             before(grammarAccess.getNeedAccess().getQuantityINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Need__QuantityAssignment_32812); 
             after(grammarAccess.getNeedAccess().getQuantityINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__QuantityAssignment_3"


    // $ANTLR start "rule__Need__NeedSetAssignment_6"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1424:1: rule__Need__NeedSetAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Need__NeedSetAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1428:1: ( ( ( RULE_ID ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1429:1: ( ( RULE_ID ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1429:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1430:1: ( RULE_ID )
            {
             before(grammarAccess.getNeedAccess().getNeedSetNeedSetCrossReference_6_0()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1431:1: ( RULE_ID )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1432:1: RULE_ID
            {
             before(grammarAccess.getNeedAccess().getNeedSetNeedSetIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Need__NeedSetAssignment_62847); 
             after(grammarAccess.getNeedAccess().getNeedSetNeedSetIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getNeedAccess().getNeedSetNeedSetCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__NeedSetAssignment_6"


    // $ANTLR start "rule__NeedSet__NameAssignment_1"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1443:1: rule__NeedSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NeedSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1447:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1448:1: ( RULE_ID )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1448:1: ( RULE_ID )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1449:1: RULE_ID
            {
             before(grammarAccess.getNeedSetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NeedSet__NameAssignment_12882); 
             after(grammarAccess.getNeedSetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeedSet__NameAssignment_1"


    // $ANTLR start "rule__NeedSet__WdAssignment_3"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1458:1: rule__NeedSet__WdAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__NeedSet__WdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1462:1: ( ( ( RULE_ID ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1463:1: ( ( RULE_ID ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1463:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1464:1: ( RULE_ID )
            {
             before(grammarAccess.getNeedSetAccess().getWdWorkDefinitionCrossReference_3_0()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1465:1: ( RULE_ID )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1466:1: RULE_ID
            {
             before(grammarAccess.getNeedSetAccess().getWdWorkDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NeedSet__WdAssignment_32917); 
             after(grammarAccess.getNeedSetAccess().getWdWorkDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getNeedSetAccess().getWdWorkDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeedSet__WdAssignment_3"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1477:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1481:1: ( ( ruleWorkSequenceType ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1482:1: ( ruleWorkSequenceType )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1482:1: ( ruleWorkSequenceType )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1483:1: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleWorkSequenceType_in_rule__WorkSequence__LinkTypeAssignment_12952);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_3"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1492:1: rule__WorkSequence__PredecessorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1496:1: ( ( ( RULE_ID ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1497:1: ( ( RULE_ID ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1497:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1498:1: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1499:1: ( RULE_ID )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1500:1: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkSequence__PredecessorAssignment_32987); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_3"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_5"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1511:1: rule__WorkSequence__SuccessorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1515:1: ( ( ( RULE_ID ) ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1516:1: ( ( RULE_ID ) )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1516:1: ( ( RULE_ID ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1517:1: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1518:1: ( RULE_ID )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1519:1: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkSequence__SuccessorAssignment_53026); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_5"


    // $ANTLR start "rule__Guidance__TextAssignment"
    // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1530:1: rule__Guidance__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Guidance__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1534:1: ( ( RULE_STRING ) )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1535:1: ( RULE_STRING )
            {
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1535:1: ( RULE_STRING )
            // ../fr.enseeiht.pdlx.t2m.ui/src-gen/fr/enseeiht/ui/contentassist/antlr/internal/InternalPDLX.g:1536:1: RULE_STRING
            {
             before(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Guidance__TextAssignment3061); 
             after(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__TextAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__0_in_ruleProcess94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessElement_in_entryRuleProcessElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessElement__Alternatives_in_ruleProcessElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkDefinition_in_entryRuleWorkDefinition181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkDefinition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__0_in_ruleWorkDefinition214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRessource_in_entryRuleRessource241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRessource248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ressource__Group__0_in_ruleRessource274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeed_in_entryRuleNeed301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNeed308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Need__Group__0_in_ruleNeed334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeedSet_in_entryRuleNeedSet361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNeedSet368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NeedSet__Group__0_in_ruleNeedSet394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequence_in_entryRuleWorkSequence421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSequence428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__0_in_ruleWorkSequence454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_entryRuleGuidance481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuidance488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guidance__TextAssignment_in_ruleGuidance514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequenceType__Alternatives_in_ruleWorkSequenceType551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkDefinition_in_rule__ProcessElement__Alternatives586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequence_in_rule__ProcessElement__Alternatives603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuidance_in_rule__ProcessElement__Alternatives620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRessource_in_rule__ProcessElement__Alternatives637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeed_in_rule__ProcessElement__Alternatives654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeedSet_in_rule__ProcessElement__Alternatives671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__WorkSequenceType__Alternatives704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WorkSequenceType__Alternatives725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__WorkSequenceType__Alternatives746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WorkSequenceType__Alternatives767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__0__Impl_in_rule__Process__Group__0800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Process__Group__1_in_rule__Process__Group__0803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Process__Group__0__Impl831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__1__Impl_in_rule__Process__Group__1862 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Process__Group__2_in_rule__Process__Group__1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__NameAssignment_1_in_rule__Process__Group__1__Impl892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__2__Impl_in_rule__Process__Group__2922 = new BitSet(new long[]{0x0000000001CE0040L});
    public static final BitSet FOLLOW_rule__Process__Group__3_in_rule__Process__Group__2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Process__Group__2__Impl953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__3__Impl_in_rule__Process__Group__3984 = new BitSet(new long[]{0x0000000001CE0040L});
    public static final BitSet FOLLOW_rule__Process__Group__4_in_rule__Process__Group__3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ProcessElementsAssignment_3_in_rule__Process__Group__3__Impl1014 = new BitSet(new long[]{0x0000000001CC0042L});
    public static final BitSet FOLLOW_rule__Process__Group__4__Impl_in_rule__Process__Group__41045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Process__Group__4__Impl1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__0__Impl_in_rule__WorkDefinition__Group__01114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__1_in_rule__WorkDefinition__Group__01117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__WorkDefinition__Group__0__Impl1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__Group__1__Impl_in_rule__WorkDefinition__Group__11176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkDefinition__NameAssignment_1_in_rule__WorkDefinition__Group__1__Impl1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ressource__Group__0__Impl_in_rule__Ressource__Group__01237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Ressource__Group__1_in_rule__Ressource__Group__01240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Ressource__Group__0__Impl1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ressource__Group__1__Impl_in_rule__Ressource__Group__11299 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Ressource__Group__2_in_rule__Ressource__Group__11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ressource__NameAssignment_1_in_rule__Ressource__Group__1__Impl1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ressource__Group__2__Impl_in_rule__Ressource__Group__21359 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Ressource__Group__3_in_rule__Ressource__Group__21362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Ressource__Group__2__Impl1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ressource__Group__3__Impl_in_rule__Ressource__Group__31421 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Ressource__Group__4_in_rule__Ressource__Group__31424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ressource__QuantityAssignment_3_in_rule__Ressource__Group__3__Impl1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ressource__Group__4__Impl_in_rule__Ressource__Group__41481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Ressource__Group__4__Impl1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Need__Group__0__Impl_in_rule__Need__Group__01550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Need__Group__1_in_rule__Need__Group__01553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Need__Group__0__Impl1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Need__Group__1__Impl_in_rule__Need__Group__11612 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Need__Group__2_in_rule__Need__Group__11615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Need__RessourceAssignment_1_in_rule__Need__Group__1__Impl1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Need__Group__2__Impl_in_rule__Need__Group__21672 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Need__Group__3_in_rule__Need__Group__21675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Need__Group__2__Impl1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Need__Group__3__Impl_in_rule__Need__Group__31734 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Need__Group__4_in_rule__Need__Group__31737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Need__QuantityAssignment_3_in_rule__Need__Group__3__Impl1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Need__Group__4__Impl_in_rule__Need__Group__41794 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Need__Group__5_in_rule__Need__Group__41797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Need__Group__4__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Need__Group__5__Impl_in_rule__Need__Group__51856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Need__Group__6_in_rule__Need__Group__51859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Need__Group__5__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Need__Group__6__Impl_in_rule__Need__Group__61918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Need__NeedSetAssignment_6_in_rule__Need__Group__6__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NeedSet__Group__0__Impl_in_rule__NeedSet__Group__01989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NeedSet__Group__1_in_rule__NeedSet__Group__01992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__NeedSet__Group__0__Impl2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NeedSet__Group__1__Impl_in_rule__NeedSet__Group__12051 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__NeedSet__Group__2_in_rule__NeedSet__Group__12054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NeedSet__NameAssignment_1_in_rule__NeedSet__Group__1__Impl2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NeedSet__Group__2__Impl_in_rule__NeedSet__Group__22111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NeedSet__Group__3_in_rule__NeedSet__Group__22114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NeedSet__Group__2__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NeedSet__Group__3__Impl_in_rule__NeedSet__Group__32173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NeedSet__WdAssignment_3_in_rule__NeedSet__Group__3__Impl2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__0__Impl_in_rule__WorkSequence__Group__02238 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__1_in_rule__WorkSequence__Group__02241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__WorkSequence__Group__0__Impl2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__1__Impl_in_rule__WorkSequence__Group__12300 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__2_in_rule__WorkSequence__Group__12303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__LinkTypeAssignment_1_in_rule__WorkSequence__Group__1__Impl2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__2__Impl_in_rule__WorkSequence__Group__22360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__3_in_rule__WorkSequence__Group__22363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__WorkSequence__Group__2__Impl2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__3__Impl_in_rule__WorkSequence__Group__32422 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__4_in_rule__WorkSequence__Group__32425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__PredecessorAssignment_3_in_rule__WorkSequence__Group__3__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__4__Impl_in_rule__WorkSequence__Group__42482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__5_in_rule__WorkSequence__Group__42485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__WorkSequence__Group__4__Impl2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__Group__5__Impl_in_rule__WorkSequence__Group__52544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkSequence__SuccessorAssignment_5_in_rule__WorkSequence__Group__5__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Process__NameAssignment_12618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessElement_in_rule__Process__ProcessElementsAssignment_32649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkDefinition__NameAssignment_12680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ressource__NameAssignment_12711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Ressource__QuantityAssignment_32742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Need__RessourceAssignment_12777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Need__QuantityAssignment_32812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Need__NeedSetAssignment_62847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NeedSet__NameAssignment_12882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NeedSet__WdAssignment_32917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSequenceType_in_rule__WorkSequence__LinkTypeAssignment_12952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkSequence__PredecessorAssignment_32987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkSequence__SuccessorAssignment_53026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Guidance__TextAssignment3061 = new BitSet(new long[]{0x0000000000000002L});

}