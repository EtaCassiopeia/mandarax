// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g 2010-09-02 09:48:51
 
	package org.mandarax.dsl.parser;
	import org.mandarax.dsl.*;
	import static org.mandarax.dsl.Utils.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class MandaraxParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Identifier", "StringLiteral", "HexLiteral", "OctalLiteral", "DecimalLiteral", "HexDigit", "IntegerTypeSuffix", "Exponent", "FloatTypeSuffix", "FloatingPointLiteral", "EscapeSequence", "CharacterLiteral", "UnicodeEscape", "OctalEscape", "Letter", "JavaIDDigit", "WS", "COMMENT", "LINE_COMMENT", "'['", "']'", "'.'", "'boolean'", "'char'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "','", "'true'", "'false'", "'='", "'{'", "'}'", "'('", "')'", "'?'", "':'", "'|'", "'&'", "'=='", "'!='", "'instanceof'", "'<='", "'>='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'!'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int FloatTypeSuffix=12;
    public static final int T__25=25;
    public static final int OctalLiteral=7;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int CharacterLiteral=15;
    public static final int Exponent=11;
    public static final int EOF=-1;
    public static final int HexDigit=9;
    public static final int Identifier=4;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int COMMENT=21;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int HexLiteral=6;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int LINE_COMMENT=22;
    public static final int IntegerTypeSuffix=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int DecimalLiteral=8;
    public static final int StringLiteral=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=20;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int UnicodeEscape=16;
    public static final int FloatingPointLiteral=13;
    public static final int JavaIDDigit=19;
    public static final int Letter=18;
    public static final int OctalEscape=17;
    public static final int EscapeSequence=14;

    // delegates
    // delegators


        public MandaraxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public MandaraxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[93+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return MandaraxParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g"; }


      private Position pos(Token token) {
      	return new Position(token.getLine(),token.getCharPositionInLine());
      }
      private Position pos(Expression expression) {
      	return expression.getPosition().clone();
      }


    public static class expression_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:30:1: expression returns [Expression value] : r= conditionalExpression ;
    public final MandaraxParser.expression_return expression() throws RecognitionException {
        MandaraxParser.expression_return retval = new MandaraxParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        CommonTree root_0 = null;

        MandaraxParser.conditionalExpression_return r = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:31:5: (r= conditionalExpression )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:31:9: r= conditionalExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_expression78);
            r=conditionalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());
            if ( state.backtracking==0 ) {
              retval.value =r.value;
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class constantDeclarator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantDeclarator"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:34:1: constantDeclarator : Identifier ;
    public final MandaraxParser.constantDeclarator_return constantDeclarator() throws RecognitionException {
        MandaraxParser.constantDeclarator_return retval = new MandaraxParser.constantDeclarator_return();
        retval.start = input.LT(1);
        int constantDeclarator_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Identifier1=null;

        CommonTree Identifier1_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:35:5: ( Identifier )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:35:9: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantDeclarator99); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier1_tree = (CommonTree)adaptor.create(Identifier1);
            adaptor.addChild(root_0, Identifier1_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, constantDeclarator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constantDeclarator"

    public static class typeName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeName"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:38:1: typeName : qualifiedName ;
    public final MandaraxParser.typeName_return typeName() throws RecognitionException {
        MandaraxParser.typeName_return retval = new MandaraxParser.typeName_return();
        retval.start = input.LT(1);
        int typeName_StartIndex = input.index();
        CommonTree root_0 = null;

        MandaraxParser.qualifiedName_return qualifiedName2 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:39:5: ( qualifiedName )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:39:9: qualifiedName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_qualifiedName_in_typeName123);
            qualifiedName2=qualifiedName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName2.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, typeName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeName"

    public static class type_return extends ParserRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:42:1: type returns [String value] : (i= classOrInterfaceType ( '[' ']' )* | j= primitiveType ( '[' ']' )* );
    public final MandaraxParser.type_return type() throws RecognitionException {
        MandaraxParser.type_return retval = new MandaraxParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal3=null;
        Token char_literal4=null;
        Token char_literal5=null;
        Token char_literal6=null;
        MandaraxParser.classOrInterfaceType_return i = null;

        MandaraxParser.primitiveType_return j = null;


        CommonTree char_literal3_tree=null;
        CommonTree char_literal4_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree char_literal6_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:43:2: (i= classOrInterfaceType ( '[' ']' )* | j= primitiveType ( '[' ']' )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Identifier) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=26 && LA3_0<=33)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:43:4: i= classOrInterfaceType ( '[' ']' )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_classOrInterfaceType_in_type145);
                    i=classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, i.getTree());
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:43:29: ( '[' ']' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==23) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:43:30: '[' ']'
                    	    {
                    	    char_literal3=(Token)match(input,23,FOLLOW_23_in_type148); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal3_tree = (CommonTree)adaptor.create(char_literal3);
                    	    adaptor.addChild(root_0, char_literal3_tree);
                    	    }
                    	    char_literal4=(Token)match(input,24,FOLLOW_24_in_type150); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal4_tree = (CommonTree)adaptor.create(char_literal4);
                    	    adaptor.addChild(root_0, char_literal4_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                      retval.value = i.value;
                    }

                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:44:4: j= primitiveType ( '[' ']' )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type163);
                    j=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, j.getTree());
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:44:22: ( '[' ']' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==23) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:44:23: '[' ']'
                    	    {
                    	    char_literal5=(Token)match(input,23,FOLLOW_23_in_type166); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal5_tree = (CommonTree)adaptor.create(char_literal5);
                    	    adaptor.addChild(root_0, char_literal5_tree);
                    	    }
                    	    char_literal6=(Token)match(input,24,FOLLOW_24_in_type168); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal6_tree = (CommonTree)adaptor.create(char_literal6);
                    	    adaptor.addChild(root_0, char_literal6_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                      retval.value = j.value;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class classOrInterfaceType_return extends ParserRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classOrInterfaceType"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:47:1: classOrInterfaceType returns [String value] : i= Identifier ( '.' i= Identifier )* ;
    public final MandaraxParser.classOrInterfaceType_return classOrInterfaceType() throws RecognitionException {
        MandaraxParser.classOrInterfaceType_return retval = new MandaraxParser.classOrInterfaceType_return();
        retval.start = input.LT(1);
        int classOrInterfaceType_StartIndex = input.index();
        CommonTree root_0 = null;

        Token i=null;
        Token char_literal7=null;

        CommonTree i_tree=null;
        CommonTree char_literal7_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:48:2: (i= Identifier ( '.' i= Identifier )* )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:48:4: i= Identifier ( '.' i= Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            i=(Token)match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType192); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            i_tree = (CommonTree)adaptor.create(i);
            adaptor.addChild(root_0, i_tree);
            }
            if ( state.backtracking==0 ) {
              retval.value =i.getText();
            }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:48:41: ( '.' i= Identifier )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:48:42: '.' i= Identifier
            	    {
            	    char_literal7=(Token)match(input,25,FOLLOW_25_in_classOrInterfaceType197); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal7_tree = (CommonTree)adaptor.create(char_literal7);
            	    adaptor.addChild(root_0, char_literal7_tree);
            	    }
            	    i=(Token)match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType203); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    i_tree = (CommonTree)adaptor.create(i);
            	    adaptor.addChild(root_0, i_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	      retval.value =retval.value+'.'+i.getText();
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, classOrInterfaceType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classOrInterfaceType"

    public static class primitiveType_return extends ParserRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:52:1: primitiveType returns [String value] : ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' );
    public final MandaraxParser.primitiveType_return primitiveType() throws RecognitionException {
        MandaraxParser.primitiveType_return retval = new MandaraxParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        CommonTree root_0 = null;

        Token string_literal8=null;
        Token string_literal9=null;
        Token string_literal10=null;
        Token string_literal11=null;
        Token string_literal12=null;
        Token string_literal13=null;
        Token string_literal14=null;
        Token string_literal15=null;

        CommonTree string_literal8_tree=null;
        CommonTree string_literal9_tree=null;
        CommonTree string_literal10_tree=null;
        CommonTree string_literal11_tree=null;
        CommonTree string_literal12_tree=null;
        CommonTree string_literal13_tree=null;
        CommonTree string_literal14_tree=null;
        CommonTree string_literal15_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:53:5: ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 29:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            case 31:
                {
                alt5=6;
                }
                break;
            case 32:
                {
                alt5=7;
                }
                break;
            case 33:
                {
                alt5=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:53:9: 'boolean'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal8=(Token)match(input,26,FOLLOW_26_in_primitiveType231); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal8_tree = (CommonTree)adaptor.create(string_literal8);
                    adaptor.addChild(root_0, string_literal8_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value ="boolean";
                    }

                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:54:9: 'char'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal9=(Token)match(input,27,FOLLOW_27_in_primitiveType243); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal9_tree = (CommonTree)adaptor.create(string_literal9);
                    adaptor.addChild(root_0, string_literal9_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value ="char";
                    }

                    }
                    break;
                case 3 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:55:9: 'byte'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal10=(Token)match(input,28,FOLLOW_28_in_primitiveType255); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal10_tree = (CommonTree)adaptor.create(string_literal10);
                    adaptor.addChild(root_0, string_literal10_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value ="byte";
                    }

                    }
                    break;
                case 4 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:56:9: 'short'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal11=(Token)match(input,29,FOLLOW_29_in_primitiveType267); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal11_tree = (CommonTree)adaptor.create(string_literal11);
                    adaptor.addChild(root_0, string_literal11_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value ="short";
                    }

                    }
                    break;
                case 5 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:57:9: 'int'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal12=(Token)match(input,30,FOLLOW_30_in_primitiveType279); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal12_tree = (CommonTree)adaptor.create(string_literal12);
                    adaptor.addChild(root_0, string_literal12_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value ="int";
                    }

                    }
                    break;
                case 6 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:58:9: 'long'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal13=(Token)match(input,31,FOLLOW_31_in_primitiveType291); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal13_tree = (CommonTree)adaptor.create(string_literal13);
                    adaptor.addChild(root_0, string_literal13_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value ="boolean";
                    }

                    }
                    break;
                case 7 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:59:9: 'float'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal14=(Token)match(input,32,FOLLOW_32_in_primitiveType303); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal14_tree = (CommonTree)adaptor.create(string_literal14);
                    adaptor.addChild(root_0, string_literal14_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value ="long";
                    }

                    }
                    break;
                case 8 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:60:9: 'double'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal15=(Token)match(input,33,FOLLOW_33_in_primitiveType315); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal15_tree = (CommonTree)adaptor.create(string_literal15);
                    adaptor.addChild(root_0, string_literal15_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value ="double";
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, primitiveType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class qualifiedNameList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualifiedNameList"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:63:1: qualifiedNameList : qualifiedName ( ',' qualifiedName )* ;
    public final MandaraxParser.qualifiedNameList_return qualifiedNameList() throws RecognitionException {
        MandaraxParser.qualifiedNameList_return retval = new MandaraxParser.qualifiedNameList_return();
        retval.start = input.LT(1);
        int qualifiedNameList_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal17=null;
        MandaraxParser.qualifiedName_return qualifiedName16 = null;

        MandaraxParser.qualifiedName_return qualifiedName18 = null;


        CommonTree char_literal17_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:64:5: ( qualifiedName ( ',' qualifiedName )* )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:64:9: qualifiedName ( ',' qualifiedName )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList341);
            qualifiedName16=qualifiedName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName16.getTree());
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:64:23: ( ',' qualifiedName )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:64:24: ',' qualifiedName
            	    {
            	    char_literal17=(Token)match(input,34,FOLLOW_34_in_qualifiedNameList344); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal17_tree = (CommonTree)adaptor.create(char_literal17);
            	    adaptor.addChild(root_0, char_literal17_tree);
            	    }
            	    pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList346);
            	    qualifiedName18=qualifiedName();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName18.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, qualifiedNameList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualifiedNameList"

    public static class qualifiedName_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualifiedName"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:67:1: qualifiedName returns [Expression value] : i= Identifier ( '.' j= Identifier )* ;
    public final MandaraxParser.qualifiedName_return qualifiedName() throws RecognitionException {
        MandaraxParser.qualifiedName_return retval = new MandaraxParser.qualifiedName_return();
        retval.start = input.LT(1);
        int qualifiedName_StartIndex = input.index();
        CommonTree root_0 = null;

        Token i=null;
        Token j=null;
        Token char_literal19=null;

        CommonTree i_tree=null;
        CommonTree j_tree=null;
        CommonTree char_literal19_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:68:2: (i= Identifier ( '.' j= Identifier )* )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:68:4: i= Identifier ( '.' j= Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            i=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName370); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            i_tree = (CommonTree)adaptor.create(i);
            adaptor.addChild(root_0, i_tree);
            }
            if ( state.backtracking==0 ) {
              retval.value =new Variable(pos(i),i.getText());
            }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:68:62: ( '.' j= Identifier )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:68:63: '.' j= Identifier
            	    {
            	    char_literal19=(Token)match(input,25,FOLLOW_25_in_qualifiedName375); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal19_tree = (CommonTree)adaptor.create(char_literal19);
            	    adaptor.addChild(root_0, char_literal19_tree);
            	    }
            	    j=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName381); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    j_tree = (CommonTree)adaptor.create(j);
            	    adaptor.addChild(root_0, j_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	      retval.value =new MemberAccess(pos(i),retval.value,j.getText());
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, qualifiedName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualifiedName"

    public static class literal_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:71:1: literal returns [Expression value] : (l1= integerLiteral | l4= StringLiteral | l5= booleanLiteral );
    public final MandaraxParser.literal_return literal() throws RecognitionException {
        MandaraxParser.literal_return retval = new MandaraxParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        CommonTree root_0 = null;

        Token l4=null;
        MandaraxParser.integerLiteral_return l1 = null;

        MandaraxParser.booleanLiteral_return l5 = null;


        CommonTree l4_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:72:5: (l1= integerLiteral | l4= StringLiteral | l5= booleanLiteral )
            int alt8=3;
            switch ( input.LA(1) ) {
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
                {
                alt8=1;
                }
                break;
            case StringLiteral:
                {
                alt8=2;
                }
                break;
            case 35:
            case 36:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:72:9: l1= integerLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteral_in_literal413);
                    l1=integerLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, l1.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = l1.value;
                    }

                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:75:9: l4= StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    l4=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal431); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    l4_tree = (CommonTree)adaptor.create(l4);
                    adaptor.addChild(root_0, l4_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = new StringLiteral(pos(l4),l4.getText().substring(1,l4.getText().length()-1));
                    }

                    }
                    break;
                case 3 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:76:9: l5= booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal447);
                    l5=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, l5.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = l5.value;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class integerLiteral_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerLiteral"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:80:1: integerLiteral returns [Expression value] : (hex= HexLiteral | oct= OctalLiteral | dec= DecimalLiteral );
    public final MandaraxParser.integerLiteral_return integerLiteral() throws RecognitionException {
        MandaraxParser.integerLiteral_return retval = new MandaraxParser.integerLiteral_return();
        retval.start = input.LT(1);
        int integerLiteral_StartIndex = input.index();
        CommonTree root_0 = null;

        Token hex=null;
        Token oct=null;
        Token dec=null;

        CommonTree hex_tree=null;
        CommonTree oct_tree=null;
        CommonTree dec_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:81:5: (hex= HexLiteral | oct= OctalLiteral | dec= DecimalLiteral )
            int alt9=3;
            switch ( input.LA(1) ) {
            case HexLiteral:
                {
                alt9=1;
                }
                break;
            case OctalLiteral:
                {
                alt9=2;
                }
                break;
            case DecimalLiteral:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:81:9: hex= HexLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    hex=(Token)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerLiteral477); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    hex_tree = (CommonTree)adaptor.create(hex);
                    adaptor.addChild(root_0, hex_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = new IntLiteral(pos(hex),Integer.parseInt(hex.getText().substring(2),16));
                    }

                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:82:9: oct= OctalLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    oct=(Token)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerLiteral493); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    oct_tree = (CommonTree)adaptor.create(oct);
                    adaptor.addChild(root_0, oct_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = new IntLiteral(pos(oct),Integer.parseInt(oct.getText(),8));
                    }

                    }
                    break;
                case 3 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:83:9: dec= DecimalLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dec=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerLiteral509); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    dec_tree = (CommonTree)adaptor.create(dec);
                    adaptor.addChild(root_0, dec_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = new IntLiteral(pos(dec),Integer.parseInt(dec.getText()));
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, integerLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "integerLiteral"

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteral"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:86:1: booleanLiteral returns [Expression value] : (t= 'true' | f= 'false' );
    public final MandaraxParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        MandaraxParser.booleanLiteral_return retval = new MandaraxParser.booleanLiteral_return();
        retval.start = input.LT(1);
        int booleanLiteral_StartIndex = input.index();
        CommonTree root_0 = null;

        Token t=null;
        Token f=null;

        CommonTree t_tree=null;
        CommonTree f_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:87:5: (t= 'true' | f= 'false' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            else if ( (LA10_0==36) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:87:9: t= 'true'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    t=(Token)match(input,35,FOLLOW_35_in_booleanLiteral538); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t_tree = (CommonTree)adaptor.create(t);
                    adaptor.addChild(root_0, t_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = new BooleanLiteral(pos(t),true);
                    }

                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:88:9: f= 'false'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    f=(Token)match(input,36,FOLLOW_36_in_booleanLiteral554); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    f_tree = (CommonTree)adaptor.create(f);
                    adaptor.addChild(root_0, f_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = new BooleanLiteral(pos(f),false);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, booleanLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "booleanLiteral"

    public static class elementValuePairs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementValuePairs"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:92:1: elementValuePairs : elementValuePair ( ',' elementValuePair )* ;
    public final MandaraxParser.elementValuePairs_return elementValuePairs() throws RecognitionException {
        MandaraxParser.elementValuePairs_return retval = new MandaraxParser.elementValuePairs_return();
        retval.start = input.LT(1);
        int elementValuePairs_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal21=null;
        MandaraxParser.elementValuePair_return elementValuePair20 = null;

        MandaraxParser.elementValuePair_return elementValuePair22 = null;


        CommonTree char_literal21_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:93:5: ( elementValuePair ( ',' elementValuePair )* )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:93:9: elementValuePair ( ',' elementValuePair )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_elementValuePair_in_elementValuePairs576);
            elementValuePair20=elementValuePair();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValuePair20.getTree());
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:93:26: ( ',' elementValuePair )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:93:27: ',' elementValuePair
            	    {
            	    char_literal21=(Token)match(input,34,FOLLOW_34_in_elementValuePairs579); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal21_tree = (CommonTree)adaptor.create(char_literal21);
            	    adaptor.addChild(root_0, char_literal21_tree);
            	    }
            	    pushFollow(FOLLOW_elementValuePair_in_elementValuePairs581);
            	    elementValuePair22=elementValuePair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValuePair22.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, elementValuePairs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementValuePairs"

    public static class elementValuePair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementValuePair"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:96:1: elementValuePair : Identifier '=' elementValue ;
    public final MandaraxParser.elementValuePair_return elementValuePair() throws RecognitionException {
        MandaraxParser.elementValuePair_return retval = new MandaraxParser.elementValuePair_return();
        retval.start = input.LT(1);
        int elementValuePair_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Identifier23=null;
        Token char_literal24=null;
        MandaraxParser.elementValue_return elementValue25 = null;


        CommonTree Identifier23_tree=null;
        CommonTree char_literal24_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:97:5: ( Identifier '=' elementValue )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:97:9: Identifier '=' elementValue
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier23=(Token)match(input,Identifier,FOLLOW_Identifier_in_elementValuePair602); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier23_tree = (CommonTree)adaptor.create(Identifier23);
            adaptor.addChild(root_0, Identifier23_tree);
            }
            char_literal24=(Token)match(input,37,FOLLOW_37_in_elementValuePair604); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal24_tree = (CommonTree)adaptor.create(char_literal24);
            adaptor.addChild(root_0, char_literal24_tree);
            }
            pushFollow(FOLLOW_elementValue_in_elementValuePair606);
            elementValue25=elementValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue25.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, elementValuePair_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementValuePair"

    public static class elementValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementValue"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:100:1: elementValue : ( conditionalExpression | elementValueArrayInitializer );
    public final MandaraxParser.elementValue_return elementValue() throws RecognitionException {
        MandaraxParser.elementValue_return retval = new MandaraxParser.elementValue_return();
        retval.start = input.LT(1);
        int elementValue_StartIndex = input.index();
        CommonTree root_0 = null;

        MandaraxParser.conditionalExpression_return conditionalExpression26 = null;

        MandaraxParser.elementValueArrayInitializer_return elementValueArrayInitializer27 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:101:5: ( conditionalExpression | elementValueArrayInitializer )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=Identifier && LA12_0<=DecimalLiteral)||(LA12_0>=35 && LA12_0<=36)||LA12_0==40||LA12_0==54||(LA12_0>=58 && LA12_0<=59)) ) {
                alt12=1;
            }
            else if ( (LA12_0==38) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:101:9: conditionalExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditionalExpression_in_elementValue629);
                    conditionalExpression26=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression26.getTree());

                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:102:9: elementValueArrayInitializer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_elementValueArrayInitializer_in_elementValue639);
                    elementValueArrayInitializer27=elementValueArrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValueArrayInitializer27.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, elementValue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementValue"

    public static class elementValueArrayInitializer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementValueArrayInitializer"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:105:1: elementValueArrayInitializer : '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' ;
    public final MandaraxParser.elementValueArrayInitializer_return elementValueArrayInitializer() throws RecognitionException {
        MandaraxParser.elementValueArrayInitializer_return retval = new MandaraxParser.elementValueArrayInitializer_return();
        retval.start = input.LT(1);
        int elementValueArrayInitializer_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal28=null;
        Token char_literal30=null;
        Token char_literal32=null;
        Token char_literal33=null;
        MandaraxParser.elementValue_return elementValue29 = null;

        MandaraxParser.elementValue_return elementValue31 = null;


        CommonTree char_literal28_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree char_literal32_tree=null;
        CommonTree char_literal33_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:106:5: ( '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:106:9: '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal28=(Token)match(input,38,FOLLOW_38_in_elementValueArrayInitializer662); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal28_tree = (CommonTree)adaptor.create(char_literal28);
            adaptor.addChild(root_0, char_literal28_tree);
            }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:106:13: ( elementValue ( ',' elementValue )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=Identifier && LA14_0<=DecimalLiteral)||(LA14_0>=35 && LA14_0<=36)||LA14_0==38||LA14_0==40||LA14_0==54||(LA14_0>=58 && LA14_0<=59)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:106:14: elementValue ( ',' elementValue )*
                    {
                    pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer665);
                    elementValue29=elementValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue29.getTree());
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:106:27: ( ',' elementValue )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==34) ) {
                            int LA13_1 = input.LA(2);

                            if ( ((LA13_1>=Identifier && LA13_1<=DecimalLiteral)||(LA13_1>=35 && LA13_1<=36)||LA13_1==38||LA13_1==40||LA13_1==54||(LA13_1>=58 && LA13_1<=59)) ) {
                                alt13=1;
                            }


                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:106:28: ',' elementValue
                    	    {
                    	    char_literal30=(Token)match(input,34,FOLLOW_34_in_elementValueArrayInitializer668); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal30_tree = (CommonTree)adaptor.create(char_literal30);
                    	    adaptor.addChild(root_0, char_literal30_tree);
                    	    }
                    	    pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer670);
                    	    elementValue31=elementValue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue31.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:106:49: ( ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:106:50: ','
                    {
                    char_literal32=(Token)match(input,34,FOLLOW_34_in_elementValueArrayInitializer677); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal32_tree = (CommonTree)adaptor.create(char_literal32);
                    adaptor.addChild(root_0, char_literal32_tree);
                    }

                    }
                    break;

            }

            char_literal33=(Token)match(input,39,FOLLOW_39_in_elementValueArrayInitializer681); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal33_tree = (CommonTree)adaptor.create(char_literal33);
            adaptor.addChild(root_0, char_literal33_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, elementValueArrayInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementValueArrayInitializer"

    public static class parExpression_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parExpression"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:111:1: parExpression returns [Expression value] : '(' expr= expression ')' ;
    public final MandaraxParser.parExpression_return parExpression() throws RecognitionException {
        MandaraxParser.parExpression_return retval = new MandaraxParser.parExpression_return();
        retval.start = input.LT(1);
        int parExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal34=null;
        Token char_literal35=null;
        MandaraxParser.expression_return expr = null;


        CommonTree char_literal34_tree=null;
        CommonTree char_literal35_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:112:5: ( '(' expr= expression ')' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:112:9: '(' expr= expression ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal34=(Token)match(input,40,FOLLOW_40_in_parExpression710); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal34_tree = (CommonTree)adaptor.create(char_literal34);
            adaptor.addChild(root_0, char_literal34_tree);
            }
            pushFollow(FOLLOW_expression_in_parExpression716);
            expr=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr.getTree());
            char_literal35=(Token)match(input,41,FOLLOW_41_in_parExpression718); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal35_tree = (CommonTree)adaptor.create(char_literal35);
            adaptor.addChild(root_0, char_literal35_tree);
            }
            if ( state.backtracking==0 ) {
              retval.value = expr.value;
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, parExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parExpression"

    public static class expressionList_return extends ParserRuleReturnScope {
        public List<Expression> values;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:115:1: expressionList returns [List<Expression> values] : e1= expression ( ',' e2= expression )* ;
    public final MandaraxParser.expressionList_return expressionList() throws RecognitionException {
        MandaraxParser.expressionList_return retval = new MandaraxParser.expressionList_return();
        retval.start = input.LT(1);
        int expressionList_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal36=null;
        MandaraxParser.expression_return e1 = null;

        MandaraxParser.expression_return e2 = null;


        CommonTree char_literal36_tree=null;

        retval.values = new ArrayList<Expression>();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:117:5: (e1= expression ( ',' e2= expression )* )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:117:9: e1= expression ( ',' e2= expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionList756);
            e1=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            if ( state.backtracking==0 ) {
              retval.values.add(e1.value);
            }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:117:50: ( ',' e2= expression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:117:51: ',' e2= expression
            	    {
            	    char_literal36=(Token)match(input,34,FOLLOW_34_in_expressionList761); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal36_tree = (CommonTree)adaptor.create(char_literal36);
            	    adaptor.addChild(root_0, char_literal36_tree);
            	    }
            	    pushFollow(FOLLOW_expression_in_expressionList767);
            	    e2=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.values.add(e2.value);
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, expressionList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalExpression"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:128:1: conditionalExpression returns [Expression value] : r1= disjunction ( '?' r2= expression ':' r3= expression )? ;
    public final MandaraxParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        MandaraxParser.conditionalExpression_return retval = new MandaraxParser.conditionalExpression_return();
        retval.start = input.LT(1);
        int conditionalExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal37=null;
        Token char_literal38=null;
        MandaraxParser.disjunction_return r1 = null;

        MandaraxParser.expression_return r2 = null;

        MandaraxParser.expression_return r3 = null;


        CommonTree char_literal37_tree=null;
        CommonTree char_literal38_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:129:5: (r1= disjunction ( '?' r2= expression ':' r3= expression )? )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:129:9: r1= disjunction ( '?' r2= expression ':' r3= expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_disjunction_in_conditionalExpression811);
            r1=disjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, r1.getTree());
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:129:26: ( '?' r2= expression ':' r3= expression )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:129:28: '?' r2= expression ':' r3= expression
                    {
                    char_literal37=(Token)match(input,42,FOLLOW_42_in_conditionalExpression815); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal37_tree = (CommonTree)adaptor.create(char_literal37);
                    adaptor.addChild(root_0, char_literal37_tree);
                    }
                    pushFollow(FOLLOW_expression_in_conditionalExpression821);
                    r2=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, r2.getTree());
                    char_literal38=(Token)match(input,43,FOLLOW_43_in_conditionalExpression823); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal38_tree = (CommonTree)adaptor.create(char_literal38);
                    adaptor.addChild(root_0, char_literal38_tree);
                    }
                    pushFollow(FOLLOW_expression_in_conditionalExpression829);
                    r3=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, r3.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              retval.value =(r2==null)?r1.value:new ConditionalExpression(pos(r1.value),r1.value,r2.value,r3.value);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, conditionalExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"

    public static class disjunction_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "disjunction"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:132:1: disjunction returns [Expression value] : part1= conjunction ( '|' part= conjunction )* ;
    public final MandaraxParser.disjunction_return disjunction() throws RecognitionException {
        MandaraxParser.disjunction_return retval = new MandaraxParser.disjunction_return();
        retval.start = input.LT(1);
        int disjunction_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal39=null;
        MandaraxParser.conjunction_return part1 = null;

        MandaraxParser.conjunction_return part = null;


        CommonTree char_literal39_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:133:5: (part1= conjunction ( '|' part= conjunction )* )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:133:9: part1= conjunction ( '|' part= conjunction )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conjunction_in_disjunction862);
            part1=conjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, part1.getTree());
            if ( state.backtracking==0 ) {
              retval.value = part1.value;
            }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:133:53: ( '|' part= conjunction )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==44) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:133:55: '|' part= conjunction
            	    {
            	    char_literal39=(Token)match(input,44,FOLLOW_44_in_disjunction868); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal39_tree = (CommonTree)adaptor.create(char_literal39);
            	    adaptor.addChild(root_0, char_literal39_tree);
            	    }
            	    pushFollow(FOLLOW_conjunction_in_disjunction874);
            	    part=conjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, part.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.value = new BinaryExpression(pos(part1.value),BinOp.OR,retval.value,part.value);
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, disjunction_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "disjunction"

    public static class conjunction_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conjunction"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:136:1: conjunction returns [Expression value] : part1= equalityExpression ( '&' part= equalityExpression )* ;
    public final MandaraxParser.conjunction_return conjunction() throws RecognitionException {
        MandaraxParser.conjunction_return retval = new MandaraxParser.conjunction_return();
        retval.start = input.LT(1);
        int conjunction_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal40=null;
        MandaraxParser.equalityExpression_return part1 = null;

        MandaraxParser.equalityExpression_return part = null;


        CommonTree char_literal40_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:137:5: (part1= equalityExpression ( '&' part= equalityExpression )* )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:137:9: part1= equalityExpression ( '&' part= equalityExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_conjunction906);
            part1=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, part1.getTree());
            if ( state.backtracking==0 ) {
              retval.value = part1.value;
            }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:137:60: ( '&' part= equalityExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==45) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:137:62: '&' part= equalityExpression
            	    {
            	    char_literal40=(Token)match(input,45,FOLLOW_45_in_conjunction912); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal40_tree = (CommonTree)adaptor.create(char_literal40);
            	    adaptor.addChild(root_0, char_literal40_tree);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_conjunction919);
            	    part=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, part.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.value = new BinaryExpression(pos(part1.value),BinOp.AND,retval.value,part.value);
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, conjunction_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conjunction"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:140:1: equalityExpression returns [Expression value] : part1= instanceOfExpression (op= ( '==' | '!=' ) part2= instanceOfExpression )* ;
    public final MandaraxParser.equalityExpression_return equalityExpression() throws RecognitionException {
        MandaraxParser.equalityExpression_return retval = new MandaraxParser.equalityExpression_return();
        retval.start = input.LT(1);
        int equalityExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token op=null;
        MandaraxParser.instanceOfExpression_return part1 = null;

        MandaraxParser.instanceOfExpression_return part2 = null;


        CommonTree op_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:141:5: (part1= instanceOfExpression (op= ( '==' | '!=' ) part2= instanceOfExpression )* )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:141:9: part1= instanceOfExpression (op= ( '==' | '!=' ) part2= instanceOfExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression951);
            part1=instanceOfExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, part1.getTree());
            if ( state.backtracking==0 ) {
              retval.value =part1.value;
            }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:141:60: (op= ( '==' | '!=' ) part2= instanceOfExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=46 && LA20_0<=47)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:141:62: op= ( '==' | '!=' ) part2= instanceOfExpression
            	    {
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=46 && input.LA(1)<=47) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(op));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression973);
            	    part2=instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, part2.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.value =new BinaryExpression(pos(part1.value),binOpForName(op.getText()),retval.value,part2.value);
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, equalityExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class instanceOfExpression_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceOfExpression"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:144:1: instanceOfExpression returns [Expression value] : part= relationalExpression ( 'instanceof' t= type )? ;
    public final MandaraxParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
        MandaraxParser.instanceOfExpression_return retval = new MandaraxParser.instanceOfExpression_return();
        retval.start = input.LT(1);
        int instanceOfExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token string_literal41=null;
        MandaraxParser.relationalExpression_return part = null;

        MandaraxParser.type_return t = null;


        CommonTree string_literal41_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:145:5: (part= relationalExpression ( 'instanceof' t= type )? )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:145:9: part= relationalExpression ( 'instanceof' t= type )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression1005);
            part=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, part.getTree());
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:145:37: ( 'instanceof' t= type )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:145:38: 'instanceof' t= type
                    {
                    string_literal41=(Token)match(input,48,FOLLOW_48_in_instanceOfExpression1008); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal41_tree = (CommonTree)adaptor.create(string_literal41);
                    adaptor.addChild(root_0, string_literal41_tree);
                    }
                    pushFollow(FOLLOW_type_in_instanceOfExpression1014);
                    t=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              retval.value = (t==null)?part.value:new InstanceOfExpression(pos(part.value),part.value,t.value);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, instanceOfExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "instanceOfExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:148:1: relationalExpression returns [Expression value] : part1= shiftExpression (op= relationalOp part2= shiftExpression )* ;
    public final MandaraxParser.relationalExpression_return relationalExpression() throws RecognitionException {
        MandaraxParser.relationalExpression_return retval = new MandaraxParser.relationalExpression_return();
        retval.start = input.LT(1);
        int relationalExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        MandaraxParser.shiftExpression_return part1 = null;

        MandaraxParser.relationalOp_return op = null;

        MandaraxParser.shiftExpression_return part2 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:149:5: (part1= shiftExpression (op= relationalOp part2= shiftExpression )* )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:149:9: part1= shiftExpression (op= relationalOp part2= shiftExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression1046);
            part1=shiftExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, part1.getTree());
            if ( state.backtracking==0 ) {
              retval.value =part1.value;
            }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:149:55: (op= relationalOp part2= shiftExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=49 && LA22_0<=52)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:149:57: op= relationalOp part2= shiftExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression1056);
            	    op=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression1062);
            	    part2=shiftExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, part2.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.value = new BinaryExpression(pos(part1.value),op.value,retval.value,part2.value);
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, relationalExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class relationalOp_return extends ParserRuleReturnScope {
        public BinOp value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalOp"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:153:1: relationalOp returns [BinOp value] : ( '<=' | '>=' | '<' | '>' );
    public final MandaraxParser.relationalOp_return relationalOp() throws RecognitionException {
        MandaraxParser.relationalOp_return retval = new MandaraxParser.relationalOp_return();
        retval.start = input.LT(1);
        int relationalOp_StartIndex = input.index();
        CommonTree root_0 = null;

        Token string_literal42=null;
        Token string_literal43=null;
        Token char_literal44=null;
        Token char_literal45=null;

        CommonTree string_literal42_tree=null;
        CommonTree string_literal43_tree=null;
        CommonTree char_literal44_tree=null;
        CommonTree char_literal45_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:154:5: ( '<=' | '>=' | '<' | '>' )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt23=1;
                }
                break;
            case 50:
                {
                alt23=2;
                }
                break;
            case 51:
                {
                alt23=3;
                }
                break;
            case 52:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:154:9: '<='
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal42=(Token)match(input,49,FOLLOW_49_in_relationalOp1096); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal42_tree = (CommonTree)adaptor.create(string_literal42);
                    adaptor.addChild(root_0, string_literal42_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = BinOp.LTE;
                    }

                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:155:9: '>='
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal43=(Token)match(input,50,FOLLOW_50_in_relationalOp1108); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal43_tree = (CommonTree)adaptor.create(string_literal43);
                    adaptor.addChild(root_0, string_literal43_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = BinOp.GTE;
                    }

                    }
                    break;
                case 3 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:156:7: '<'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal44=(Token)match(input,51,FOLLOW_51_in_relationalOp1118); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal44_tree = (CommonTree)adaptor.create(char_literal44);
                    adaptor.addChild(root_0, char_literal44_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = BinOp.LT;
                    }

                    }
                    break;
                case 4 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:157:9: '>'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal45=(Token)match(input,52,FOLLOW_52_in_relationalOp1130); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal45_tree = (CommonTree)adaptor.create(char_literal45);
                    adaptor.addChild(root_0, char_literal45_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = BinOp.GT;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, relationalOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalOp"

    public static class shiftExpression_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpression"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:161:1: shiftExpression returns [Expression value] : part1= additiveExpression (op= shiftOp part= additiveExpression )? ;
    public final MandaraxParser.shiftExpression_return shiftExpression() throws RecognitionException {
        MandaraxParser.shiftExpression_return retval = new MandaraxParser.shiftExpression_return();
        retval.start = input.LT(1);
        int shiftExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        MandaraxParser.additiveExpression_return part1 = null;

        MandaraxParser.shiftOp_return op = null;

        MandaraxParser.additiveExpression_return part = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:162:5: (part1= additiveExpression (op= shiftOp part= additiveExpression )? )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:162:9: part1= additiveExpression (op= shiftOp part= additiveExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression1160);
            part1=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, part1.getTree());
            if ( state.backtracking==0 ) {
              retval.value = part1.value;
            }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:162:60: (op= shiftOp part= additiveExpression )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==51) ) {
                    alt24=1;
                }
            }
            else if ( (LA24_0==52) ) {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==52) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:162:62: op= shiftOp part= additiveExpression
                    {
                    pushFollow(FOLLOW_shiftOp_in_shiftExpression1170);
                    op=shiftOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op.getTree());
                    pushFollow(FOLLOW_additiveExpression_in_shiftExpression1176);
                    part=additiveExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, part.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = new BinaryExpression(pos(part1.value),op.value,retval.value,part.value);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, shiftExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shiftExpression"

    public static class shiftOp_return extends ParserRuleReturnScope {
        public BinOp value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftOp"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:165:1: shiftOp returns [BinOp value] : ( ( '<' '<' )=>t1= '<' t2= '<' {...}? | ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}? | ( '>' '>' )=>t1= '>' t2= '>' {...}?);
    public final MandaraxParser.shiftOp_return shiftOp() throws RecognitionException {
        MandaraxParser.shiftOp_return retval = new MandaraxParser.shiftOp_return();
        retval.start = input.LT(1);
        int shiftOp_StartIndex = input.index();
        CommonTree root_0 = null;

        Token t1=null;
        Token t2=null;
        Token t3=null;

        CommonTree t1_tree=null;
        CommonTree t2_tree=null;
        CommonTree t3_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:166:5: ( ( '<' '<' )=>t1= '<' t2= '<' {...}? | ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}? | ( '>' '>' )=>t1= '>' t2= '>' {...}?)
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:166:9: ( '<' '<' )=>t1= '<' t2= '<' {...}?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    t1=(Token)match(input,51,FOLLOW_51_in_shiftOp1213); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = (CommonTree)adaptor.create(t1);
                    adaptor.addChild(root_0, t1_tree);
                    }
                    t2=(Token)match(input,51,FOLLOW_51_in_shiftOp1217); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = (CommonTree)adaptor.create(t2);
                    adaptor.addChild(root_0, t2_tree);
                    }
                    if ( !(( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = BinOp.SHIFT_LL;
                    }

                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:169:9: ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    t1=(Token)match(input,52,FOLLOW_52_in_shiftOp1251); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = (CommonTree)adaptor.create(t1);
                    adaptor.addChild(root_0, t1_tree);
                    }
                    t2=(Token)match(input,52,FOLLOW_52_in_shiftOp1255); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = (CommonTree)adaptor.create(t2);
                    adaptor.addChild(root_0, t2_tree);
                    }
                    t3=(Token)match(input,52,FOLLOW_52_in_shiftOp1259); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t3_tree = (CommonTree)adaptor.create(t3);
                    adaptor.addChild(root_0, t3_tree);
                    }
                    if ( !(( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() &&
                              t2.getLine() == t3.getLine() && 
                              t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&\n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ");
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = BinOp.SHIFT_RRR;
                    }

                    }
                    break;
                case 3 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:174:9: ( '>' '>' )=>t1= '>' t2= '>' {...}?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    t1=(Token)match(input,52,FOLLOW_52_in_shiftOp1291); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = (CommonTree)adaptor.create(t1);
                    adaptor.addChild(root_0, t1_tree);
                    }
                    t2=(Token)match(input,52,FOLLOW_52_in_shiftOp1295); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = (CommonTree)adaptor.create(t2);
                    adaptor.addChild(root_0, t2_tree);
                    }
                    if ( !(( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = BinOp.SHIFT_RR;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, shiftOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shiftOp"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:180:1: additiveExpression returns [Expression value] : part1= multiplicativeExpression (op= ( '+' | '-' ) part= multiplicativeExpression )* ;
    public final MandaraxParser.additiveExpression_return additiveExpression() throws RecognitionException {
        MandaraxParser.additiveExpression_return retval = new MandaraxParser.additiveExpression_return();
        retval.start = input.LT(1);
        int additiveExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token op=null;
        MandaraxParser.multiplicativeExpression_return part1 = null;

        MandaraxParser.multiplicativeExpression_return part = null;


        CommonTree op_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:181:5: (part1= multiplicativeExpression (op= ( '+' | '-' ) part= multiplicativeExpression )* )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:181:8: part1= multiplicativeExpression (op= ( '+' | '-' ) part= multiplicativeExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1334);
            part1=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, part1.getTree());
            if ( state.backtracking==0 ) {
              retval.value = part1.value;
            }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:181:64: (op= ( '+' | '-' ) part= multiplicativeExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=53 && LA26_0<=54)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:181:66: op= ( '+' | '-' ) part= multiplicativeExpression
            	    {
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=53 && input.LA(1)<=54) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(op));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1355);
            	    part=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, part.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.value = new BinaryExpression(pos(part1.value),binOpForName(op.getText()),retval.value,part.value);
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, additiveExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:184:1: multiplicativeExpression returns [Expression value] : part1= unaryExpression (op= ( '*' | '/' | '%' ) part= unaryExpression )* ;
    public final MandaraxParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        MandaraxParser.multiplicativeExpression_return retval = new MandaraxParser.multiplicativeExpression_return();
        retval.start = input.LT(1);
        int multiplicativeExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token op=null;
        MandaraxParser.unaryExpression_return part1 = null;

        MandaraxParser.unaryExpression_return part = null;


        CommonTree op_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:185:5: (part1= unaryExpression (op= ( '*' | '/' | '%' ) part= unaryExpression )* )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:185:8: part1= unaryExpression (op= ( '*' | '/' | '%' ) part= unaryExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1386);
            part1=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, part1.getTree());
            if ( state.backtracking==0 ) {
              retval.value = part1.value;
            }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:185:56: (op= ( '*' | '/' | '%' ) part= unaryExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=55 && LA27_0<=57)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:185:58: op= ( '*' | '/' | '%' ) part= unaryExpression
            	    {
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=55 && input.LA(1)<=57) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(op));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1413);
            	    part=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, part.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.value = new BinaryExpression(pos(part1.value),binOpForName(op.getText()),retval.value,part.value);
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, multiplicativeExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:188:1: unaryExpression returns [Expression value] : ( '-' part1= unaryExpression | part2= unaryExpressionNotPlusMinus );
    public final MandaraxParser.unaryExpression_return unaryExpression() throws RecognitionException {
        MandaraxParser.unaryExpression_return retval = new MandaraxParser.unaryExpression_return();
        retval.start = input.LT(1);
        int unaryExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal46=null;
        MandaraxParser.unaryExpression_return part1 = null;

        MandaraxParser.unaryExpressionNotPlusMinus_return part2 = null;


        CommonTree char_literal46_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:189:5: ( '-' part1= unaryExpression | part2= unaryExpressionNotPlusMinus )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==54) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=Identifier && LA28_0<=DecimalLiteral)||(LA28_0>=35 && LA28_0<=36)||LA28_0==40||(LA28_0>=58 && LA28_0<=59)) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:189:9: '-' part1= unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal46=(Token)match(input,54,FOLLOW_54_in_unaryExpression1445); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal46_tree = (CommonTree)adaptor.create(char_literal46);
                    adaptor.addChild(root_0, char_literal46_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1451);
                    part1=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, part1.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = new UnaryExpression(pos(part1.value),UnOp.MINUS,part1.value);
                    }

                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:190:9: part2= unaryExpressionNotPlusMinus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1467);
                    part2=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, part2.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = part2.value;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, unaryExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpressionNotPlusMinus"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:193:1: unaryExpressionNotPlusMinus returns [Expression value] : ( '~' r1= unaryExpression | '!' r2= unaryExpression | r3= castExpression | r8= methodInvocation | r7= propertyAccess | r4= objectref | r5= qualifiedName | r6= parExpression );
    public final MandaraxParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        MandaraxParser.unaryExpressionNotPlusMinus_return retval = new MandaraxParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);
        int unaryExpressionNotPlusMinus_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal47=null;
        Token char_literal48=null;
        MandaraxParser.unaryExpression_return r1 = null;

        MandaraxParser.unaryExpression_return r2 = null;

        MandaraxParser.castExpression_return r3 = null;

        MandaraxParser.methodInvocation_return r8 = null;

        MandaraxParser.propertyAccess_return r7 = null;

        MandaraxParser.objectref_return r4 = null;

        MandaraxParser.qualifiedName_return r5 = null;

        MandaraxParser.parExpression_return r6 = null;


        CommonTree char_literal47_tree=null;
        CommonTree char_literal48_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:194:5: ( '~' r1= unaryExpression | '!' r2= unaryExpression | r3= castExpression | r8= methodInvocation | r7= propertyAccess | r4= objectref | r5= qualifiedName | r6= parExpression )
            int alt29=8;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:194:9: '~' r1= unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal47=(Token)match(input,58,FOLLOW_58_in_unaryExpressionNotPlusMinus1492); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal47_tree = (CommonTree)adaptor.create(char_literal47);
                    adaptor.addChild(root_0, char_literal47_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1498);
                    r1=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, r1.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = new UnaryExpression(pos(r1.value),UnOp.COMPL,r1.value);
                    }

                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:195:9: '!' r2= unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal48=(Token)match(input,59,FOLLOW_59_in_unaryExpressionNotPlusMinus1510); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal48_tree = (CommonTree)adaptor.create(char_literal48);
                    adaptor.addChild(root_0, char_literal48_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1516);
                    r2=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, r2.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = new UnaryExpression(pos(r2.value),UnOp.NOT,r2.value);
                    }

                    }
                    break;
                case 3 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:196:9: r3= castExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_castExpression_in_unaryExpressionNotPlusMinus1532);
                    r3=castExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, r3.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = r3.value;
                    }

                    }
                    break;
                case 4 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:197:9: r8= methodInvocation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_methodInvocation_in_unaryExpressionNotPlusMinus1548);
                    r8=methodInvocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, r8.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = r8.value;
                    }

                    }
                    break;
                case 5 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:198:9: r7= propertyAccess
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_propertyAccess_in_unaryExpressionNotPlusMinus1564);
                    r7=propertyAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, r7.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = r7.value;
                    }

                    }
                    break;
                case 6 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:199:9: r4= objectref
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectref_in_unaryExpressionNotPlusMinus1580);
                    r4=objectref();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, r4.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = r4.value;
                    }

                    }
                    break;
                case 7 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:200:9: r5= qualifiedName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_qualifiedName_in_unaryExpressionNotPlusMinus1596);
                    r5=qualifiedName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, r5.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = r5.value;
                    }

                    }
                    break;
                case 8 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:201:9: r6= parExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parExpression_in_unaryExpressionNotPlusMinus1612);
                    r6=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, r6.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = r6.value;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, unaryExpressionNotPlusMinus_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"

    public static class propertyAccess_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyAccess"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:204:1: propertyAccess returns [Expression value] : o= objectref ( '.' i= Identifier )* ;
    public final MandaraxParser.propertyAccess_return propertyAccess() throws RecognitionException {
        MandaraxParser.propertyAccess_return retval = new MandaraxParser.propertyAccess_return();
        retval.start = input.LT(1);
        int propertyAccess_StartIndex = input.index();
        CommonTree root_0 = null;

        Token i=null;
        Token char_literal49=null;
        MandaraxParser.objectref_return o = null;


        CommonTree i_tree=null;
        CommonTree char_literal49_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:205:5: (o= objectref ( '.' i= Identifier )* )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:205:9: o= objectref ( '.' i= Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_objectref_in_propertyAccess1645);
            o=objectref();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, o.getTree());
            if ( state.backtracking==0 ) {
              retval.value = o.value;
            }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:205:43: ( '.' i= Identifier )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==25) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:205:44: '.' i= Identifier
            	    {
            	    char_literal49=(Token)match(input,25,FOLLOW_25_in_propertyAccess1650); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal49_tree = (CommonTree)adaptor.create(char_literal49);
            	    adaptor.addChild(root_0, char_literal49_tree);
            	    }
            	    i=(Token)match(input,Identifier,FOLLOW_Identifier_in_propertyAccess1655); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    i_tree = (CommonTree)adaptor.create(i);
            	    adaptor.addChild(root_0, i_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	      retval.value = new MemberAccess(pos(o.value),retval.value,i.getText());
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, propertyAccess_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propertyAccess"

    public static class methodInvocation_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodInvocation"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:208:1: methodInvocation returns [Expression value] : o= objectref ( '.' i= Identifier '(' (p= expressionList )? ')' )* ;
    public final MandaraxParser.methodInvocation_return methodInvocation() throws RecognitionException {
        MandaraxParser.methodInvocation_return retval = new MandaraxParser.methodInvocation_return();
        retval.start = input.LT(1);
        int methodInvocation_StartIndex = input.index();
        CommonTree root_0 = null;

        Token i=null;
        Token char_literal50=null;
        Token char_literal51=null;
        Token char_literal52=null;
        MandaraxParser.objectref_return o = null;

        MandaraxParser.expressionList_return p = null;


        CommonTree i_tree=null;
        CommonTree char_literal50_tree=null;
        CommonTree char_literal51_tree=null;
        CommonTree char_literal52_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:209:5: (o= objectref ( '.' i= Identifier '(' (p= expressionList )? ')' )* )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:209:9: o= objectref ( '.' i= Identifier '(' (p= expressionList )? ')' )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_objectref_in_methodInvocation1688);
            o=objectref();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, o.getTree());
            if ( state.backtracking==0 ) {
              retval.value = o.value;
            }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:209:43: ( '.' i= Identifier '(' (p= expressionList )? ')' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==25) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:209:44: '.' i= Identifier '(' (p= expressionList )? ')'
            	    {
            	    char_literal50=(Token)match(input,25,FOLLOW_25_in_methodInvocation1693); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal50_tree = (CommonTree)adaptor.create(char_literal50);
            	    adaptor.addChild(root_0, char_literal50_tree);
            	    }
            	    i=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodInvocation1699); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    i_tree = (CommonTree)adaptor.create(i);
            	    adaptor.addChild(root_0, i_tree);
            	    }
            	    char_literal51=(Token)match(input,40,FOLLOW_40_in_methodInvocation1701); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal51_tree = (CommonTree)adaptor.create(char_literal51);
            	    adaptor.addChild(root_0, char_literal51_tree);
            	    }
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:209:66: (p= expressionList )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( ((LA31_0>=Identifier && LA31_0<=DecimalLiteral)||(LA31_0>=35 && LA31_0<=36)||LA31_0==40||LA31_0==54||(LA31_0>=58 && LA31_0<=59)) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:209:67: p= expressionList
            	            {
            	            pushFollow(FOLLOW_expressionList_in_methodInvocation1707);
            	            p=expressionList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, p.getTree());

            	            }
            	            break;

            	    }

            	    char_literal52=(Token)match(input,41,FOLLOW_41_in_methodInvocation1711); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal52_tree = (CommonTree)adaptor.create(char_literal52);
            	    adaptor.addChild(root_0, char_literal52_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	      retval.value = new MemberAccess(pos(o.value),retval.value,i.getText(),p==null?new ArrayList<Expression>():p.values);
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, methodInvocation_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodInvocation"

    public static class objectref_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectref"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:212:1: objectref returns [Expression value] : (r1= Identifier | r2= literal | r3= parExpression );
    public final MandaraxParser.objectref_return objectref() throws RecognitionException {
        MandaraxParser.objectref_return retval = new MandaraxParser.objectref_return();
        retval.start = input.LT(1);
        int objectref_StartIndex = input.index();
        CommonTree root_0 = null;

        Token r1=null;
        MandaraxParser.literal_return r2 = null;

        MandaraxParser.parExpression_return r3 = null;


        CommonTree r1_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:213:6: (r1= Identifier | r2= literal | r3= parExpression )
            int alt33=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                alt33=1;
                }
                break;
            case StringLiteral:
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case 35:
            case 36:
                {
                alt33=2;
                }
                break;
            case 40:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:213:8: r1= Identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    r1=(Token)match(input,Identifier,FOLLOW_Identifier_in_objectref1746); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    r1_tree = (CommonTree)adaptor.create(r1);
                    adaptor.addChild(root_0, r1_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = new Variable(pos(r1),r1.getText());
                    }

                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:214:8: r2= literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_objectref1761);
                    r2=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, r2.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = r2.value;
                    }

                    }
                    break;
                case 3 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:215:8: r3= parExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parExpression_in_objectref1776);
                    r3=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, r3.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = r3.value;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, objectref_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objectref"

    public static class castExpression_return extends ParserRuleReturnScope {
        public Expression value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "castExpression"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:218:1: castExpression returns [Expression value] : ( '(' t1= primitiveType ')' exp1= unaryExpression | '(' t2= type ')' exp2= unaryExpressionNotPlusMinus );
    public final MandaraxParser.castExpression_return castExpression() throws RecognitionException {
        MandaraxParser.castExpression_return retval = new MandaraxParser.castExpression_return();
        retval.start = input.LT(1);
        int castExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal53=null;
        Token char_literal54=null;
        Token char_literal55=null;
        Token char_literal56=null;
        MandaraxParser.primitiveType_return t1 = null;

        MandaraxParser.unaryExpression_return exp1 = null;

        MandaraxParser.type_return t2 = null;

        MandaraxParser.unaryExpressionNotPlusMinus_return exp2 = null;


        CommonTree char_literal53_tree=null;
        CommonTree char_literal54_tree=null;
        CommonTree char_literal55_tree=null;
        CommonTree char_literal56_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:219:5: ( '(' t1= primitiveType ')' exp1= unaryExpression | '(' t2= type ')' exp2= unaryExpressionNotPlusMinus )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                int LA34_1 = input.LA(2);

                if ( (synpred57_Mandarax()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:219:8: '(' t1= primitiveType ')' exp1= unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal53=(Token)match(input,40,FOLLOW_40_in_castExpression1809); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal53_tree = (CommonTree)adaptor.create(char_literal53);
                    adaptor.addChild(root_0, char_literal53_tree);
                    }
                    pushFollow(FOLLOW_primitiveType_in_castExpression1815);
                    t1=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, t1.getTree());
                    char_literal54=(Token)match(input,41,FOLLOW_41_in_castExpression1817); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal54_tree = (CommonTree)adaptor.create(char_literal54);
                    adaptor.addChild(root_0, char_literal54_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_castExpression1823);
                    exp1=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp1.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = new CastExpression(pos(t1.start),exp1.value,t1.value);
                    }

                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:220:8: '(' t2= type ')' exp2= unaryExpressionNotPlusMinus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal55=(Token)match(input,40,FOLLOW_40_in_castExpression1834); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal55_tree = (CommonTree)adaptor.create(char_literal55);
                    adaptor.addChild(root_0, char_literal55_tree);
                    }
                    pushFollow(FOLLOW_type_in_castExpression1840);
                    t2=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, t2.getTree());
                    char_literal56=(Token)match(input,41,FOLLOW_41_in_castExpression1842); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal56_tree = (CommonTree)adaptor.create(char_literal56);
                    adaptor.addChild(root_0, char_literal56_tree);
                    }
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_castExpression1848);
                    exp2=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp2.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value = new CastExpression(pos(t2.start),exp2.value,t2.value);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, castExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "castExpression"

    public static class arguments_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:223:1: arguments : '(' ( expressionList )? ')' ;
    public final MandaraxParser.arguments_return arguments() throws RecognitionException {
        MandaraxParser.arguments_return retval = new MandaraxParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal57=null;
        Token char_literal59=null;
        MandaraxParser.expressionList_return expressionList58 = null;


        CommonTree char_literal57_tree=null;
        CommonTree char_literal59_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:224:5: ( '(' ( expressionList )? ')' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:224:9: '(' ( expressionList )? ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal57=(Token)match(input,40,FOLLOW_40_in_arguments1870); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal57_tree = (CommonTree)adaptor.create(char_literal57);
            adaptor.addChild(root_0, char_literal57_tree);
            }
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:224:13: ( expressionList )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=Identifier && LA35_0<=DecimalLiteral)||(LA35_0>=35 && LA35_0<=36)||LA35_0==40||LA35_0==54||(LA35_0>=58 && LA35_0<=59)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:0:0: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments1872);
                    expressionList58=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList58.getTree());

                    }
                    break;

            }

            char_literal59=(Token)match(input,41,FOLLOW_41_in_arguments1875); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal59_tree = (CommonTree)adaptor.create(char_literal59);
            adaptor.addChild(root_0, char_literal59_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, arguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arguments"

    // $ANTLR start synpred36_Mandarax
    public final void synpred36_Mandarax_fragment() throws RecognitionException {   
        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:166:9: ( '<' '<' )
        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:166:10: '<' '<'
        {
        match(input,51,FOLLOW_51_in_synpred36_Mandarax1205); if (state.failed) return ;
        match(input,51,FOLLOW_51_in_synpred36_Mandarax1207); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_Mandarax

    // $ANTLR start synpred37_Mandarax
    public final void synpred37_Mandarax_fragment() throws RecognitionException {   
        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:169:9: ( '>' '>' '>' )
        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:169:10: '>' '>' '>'
        {
        match(input,52,FOLLOW_52_in_synpred37_Mandarax1241); if (state.failed) return ;
        match(input,52,FOLLOW_52_in_synpred37_Mandarax1243); if (state.failed) return ;
        match(input,52,FOLLOW_52_in_synpred37_Mandarax1245); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_Mandarax

    // $ANTLR start synpred38_Mandarax
    public final void synpred38_Mandarax_fragment() throws RecognitionException {   
        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:174:9: ( '>' '>' )
        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:174:10: '>' '>'
        {
        match(input,52,FOLLOW_52_in_synpred38_Mandarax1283); if (state.failed) return ;
        match(input,52,FOLLOW_52_in_synpred38_Mandarax1285); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_Mandarax

    // $ANTLR start synpred47_Mandarax
    public final void synpred47_Mandarax_fragment() throws RecognitionException {   
        MandaraxParser.castExpression_return r3 = null;


        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:196:9: (r3= castExpression )
        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:196:9: r3= castExpression
        {
        pushFollow(FOLLOW_castExpression_in_synpred47_Mandarax1532);
        r3=castExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_Mandarax

    // $ANTLR start synpred48_Mandarax
    public final void synpred48_Mandarax_fragment() throws RecognitionException {   
        MandaraxParser.methodInvocation_return r8 = null;


        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:197:9: (r8= methodInvocation )
        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:197:9: r8= methodInvocation
        {
        pushFollow(FOLLOW_methodInvocation_in_synpred48_Mandarax1548);
        r8=methodInvocation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Mandarax

    // $ANTLR start synpred49_Mandarax
    public final void synpred49_Mandarax_fragment() throws RecognitionException {   
        MandaraxParser.propertyAccess_return r7 = null;


        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:198:9: (r7= propertyAccess )
        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:198:9: r7= propertyAccess
        {
        pushFollow(FOLLOW_propertyAccess_in_synpred49_Mandarax1564);
        r7=propertyAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_Mandarax

    // $ANTLR start synpred50_Mandarax
    public final void synpred50_Mandarax_fragment() throws RecognitionException {   
        MandaraxParser.objectref_return r4 = null;


        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:199:9: (r4= objectref )
        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:199:9: r4= objectref
        {
        pushFollow(FOLLOW_objectref_in_synpred50_Mandarax1580);
        r4=objectref();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_Mandarax

    // $ANTLR start synpred51_Mandarax
    public final void synpred51_Mandarax_fragment() throws RecognitionException {   
        MandaraxParser.qualifiedName_return r5 = null;


        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:200:9: (r5= qualifiedName )
        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:200:9: r5= qualifiedName
        {
        pushFollow(FOLLOW_qualifiedName_in_synpred51_Mandarax1596);
        r5=qualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_Mandarax

    // $ANTLR start synpred57_Mandarax
    public final void synpred57_Mandarax_fragment() throws RecognitionException {   
        MandaraxParser.primitiveType_return t1 = null;

        MandaraxParser.unaryExpression_return exp1 = null;


        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:219:8: ( '(' t1= primitiveType ')' exp1= unaryExpression )
        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:219:8: '(' t1= primitiveType ')' exp1= unaryExpression
        {
        match(input,40,FOLLOW_40_in_synpred57_Mandarax1809); if (state.failed) return ;
        pushFollow(FOLLOW_primitiveType_in_synpred57_Mandarax1815);
        t1=primitiveType();

        state._fsp--;
        if (state.failed) return ;
        match(input,41,FOLLOW_41_in_synpred57_Mandarax1817); if (state.failed) return ;
        pushFollow(FOLLOW_unaryExpression_in_synpred57_Mandarax1823);
        exp1=unaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_Mandarax

    // Delegated rules

    public final boolean synpred50_Mandarax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_Mandarax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_Mandarax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_Mandarax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_Mandarax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_Mandarax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_Mandarax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_Mandarax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_Mandarax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_Mandarax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_Mandarax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_Mandarax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_Mandarax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_Mandarax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_Mandarax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_Mandarax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_Mandarax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_Mandarax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA25_eotS =
        "\20\uffff";
    static final String DFA25_eofS =
        "\20\uffff";
    static final String DFA25_minS =
        "\1\63\1\uffff\1\64\1\4\14\uffff";
    static final String DFA25_maxS =
        "\1\64\1\uffff\1\64\1\73\14\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\13\3";
    static final String DFA25_specialS =
        "\1\1\2\uffff\1\0\14\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\1\2",
            "",
            "\1\3",
            "\1\11\1\15\1\12\1\13\1\14\32\uffff\1\16\1\17\3\uffff\1\10\13"+
            "\uffff\1\4\1\uffff\1\5\3\uffff\1\6\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "165:1: shiftOp returns [BinOp value] : ( ( '<' '<' )=>t1= '<' t2= '<' {...}? | ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}? | ( '>' '>' )=>t1= '>' t2= '>' {...}?);";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_3 = input.LA(1);

                         
                        int index25_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_3==52) && (synpred37_Mandarax())) {s = 4;}

                        else if ( (LA25_3==54) && (synpred38_Mandarax())) {s = 5;}

                        else if ( (LA25_3==58) && (synpred38_Mandarax())) {s = 6;}

                        else if ( (LA25_3==59) && (synpred38_Mandarax())) {s = 7;}

                        else if ( (LA25_3==40) && (synpred38_Mandarax())) {s = 8;}

                        else if ( (LA25_3==Identifier) && (synpred38_Mandarax())) {s = 9;}

                        else if ( (LA25_3==HexLiteral) && (synpred38_Mandarax())) {s = 10;}

                        else if ( (LA25_3==OctalLiteral) && (synpred38_Mandarax())) {s = 11;}

                        else if ( (LA25_3==DecimalLiteral) && (synpred38_Mandarax())) {s = 12;}

                        else if ( (LA25_3==StringLiteral) && (synpred38_Mandarax())) {s = 13;}

                        else if ( (LA25_3==35) && (synpred38_Mandarax())) {s = 14;}

                        else if ( (LA25_3==36) && (synpred38_Mandarax())) {s = 15;}

                         
                        input.seek(index25_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_0 = input.LA(1);

                         
                        int index25_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_0==51) && (synpred36_Mandarax())) {s = 1;}

                        else if ( (LA25_0==52) ) {s = 2;}

                         
                        input.seek(index25_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\21\uffff";
    static final String DFA29_eofS =
        "\21\uffff";
    static final String DFA29_minS =
        "\1\4\2\uffff\10\0\6\uffff";
    static final String DFA29_maxS =
        "\1\73\2\uffff\10\0\6\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\2\10\uffff\1\3\1\4\1\5\1\6\1\10\1\7";
    static final String DFA29_specialS =
        "\3\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\6\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\4\1\10\1\5\1\6\1\7\32\uffff\1\11\1\12\3\uffff\1\3\21\uffff"+
            "\1\1\1\2",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "193:1: unaryExpressionNotPlusMinus returns [Expression value] : ( '~' r1= unaryExpression | '!' r2= unaryExpression | r3= castExpression | r8= methodInvocation | r7= propertyAccess | r4= objectref | r5= qualifiedName | r6= parExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_3 = input.LA(1);

                         
                        int index29_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_Mandarax()) ) {s = 11;}

                        else if ( (synpred48_Mandarax()) ) {s = 12;}

                        else if ( (synpred49_Mandarax()) ) {s = 13;}

                        else if ( (synpred50_Mandarax()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index29_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_4 = input.LA(1);

                         
                        int index29_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Mandarax()) ) {s = 12;}

                        else if ( (synpred49_Mandarax()) ) {s = 13;}

                        else if ( (synpred50_Mandarax()) ) {s = 14;}

                        else if ( (synpred51_Mandarax()) ) {s = 16;}

                         
                        input.seek(index29_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_5 = input.LA(1);

                         
                        int index29_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Mandarax()) ) {s = 12;}

                        else if ( (synpred49_Mandarax()) ) {s = 13;}

                        else if ( (synpred50_Mandarax()) ) {s = 14;}

                         
                        input.seek(index29_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_6 = input.LA(1);

                         
                        int index29_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Mandarax()) ) {s = 12;}

                        else if ( (synpred49_Mandarax()) ) {s = 13;}

                        else if ( (synpred50_Mandarax()) ) {s = 14;}

                         
                        input.seek(index29_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_7 = input.LA(1);

                         
                        int index29_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Mandarax()) ) {s = 12;}

                        else if ( (synpred49_Mandarax()) ) {s = 13;}

                        else if ( (synpred50_Mandarax()) ) {s = 14;}

                         
                        input.seek(index29_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA29_8 = input.LA(1);

                         
                        int index29_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Mandarax()) ) {s = 12;}

                        else if ( (synpred49_Mandarax()) ) {s = 13;}

                        else if ( (synpred50_Mandarax()) ) {s = 14;}

                         
                        input.seek(index29_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA29_9 = input.LA(1);

                         
                        int index29_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Mandarax()) ) {s = 12;}

                        else if ( (synpred49_Mandarax()) ) {s = 13;}

                        else if ( (synpred50_Mandarax()) ) {s = 14;}

                         
                        input.seek(index29_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA29_10 = input.LA(1);

                         
                        int index29_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_Mandarax()) ) {s = 12;}

                        else if ( (synpred49_Mandarax()) ) {s = 13;}

                        else if ( (synpred50_Mandarax()) ) {s = 14;}

                         
                        input.seek(index29_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_conditionalExpression_in_expression78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_constantDeclarator99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_typeName123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_type145 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_type148 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_type150 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_primitiveType_in_type163 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_type166 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_type168 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType192 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_classOrInterfaceType197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType203 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_26_in_primitiveType231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_primitiveType243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_primitiveType255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_primitiveType267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_primitiveType279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_primitiveType291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_primitiveType303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_primitiveType315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList341 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_qualifiedNameList344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList346 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName370 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_qualifiedName375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName381 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_integerLiteral_in_literal413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerLiteral477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerLiteral493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerLiteral509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_booleanLiteral538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_booleanLiteral554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs576 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_elementValuePairs579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs581 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_Identifier_in_elementValuePair602 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_elementValuePair604 = new BitSet(new long[]{0x0C400158000001F0L});
    public static final BitSet FOLLOW_elementValue_in_elementValuePair606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_elementValue629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementValueArrayInitializer_in_elementValue639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_elementValueArrayInitializer662 = new BitSet(new long[]{0x0C4001DC000001F0L});
    public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer665 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_34_in_elementValueArrayInitializer668 = new BitSet(new long[]{0x0C400158000001F0L});
    public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer670 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_34_in_elementValueArrayInitializer677 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_elementValueArrayInitializer681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_parExpression710 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_expression_in_parExpression716 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_parExpression718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList756 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_expressionList761 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_expression_in_expressionList767 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_disjunction_in_conditionalExpression811 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_conditionalExpression815 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression821 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_conditionalExpression823 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction862 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_disjunction868 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_conjunction_in_disjunction874 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_conjunction906 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_conjunction912 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_equalityExpression_in_conjunction919 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression951 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_set_in_equalityExpression961 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression973 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression1005 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_instanceOfExpression1008 = new BitSet(new long[]{0x00000003FC000010L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression1046 = new BitSet(new long[]{0x001E000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression1056 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression1062 = new BitSet(new long[]{0x001E000000000002L});
    public static final BitSet FOLLOW_49_in_relationalOp1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_relationalOp1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_relationalOp1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_relationalOp1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1160 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_shiftOp_in_shiftExpression1170 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_shiftOp1213 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_shiftOp1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_shiftOp1251 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_shiftOp1255 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_shiftOp1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_shiftOp1291 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_shiftOp1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1334 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1343 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1355 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1386 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1395 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1413 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_54_in_unaryExpression1445 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_unaryExpressionNotPlusMinus1492 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_unaryExpressionNotPlusMinus1510 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_unaryExpressionNotPlusMinus1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodInvocation_in_unaryExpressionNotPlusMinus1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyAccess_in_unaryExpressionNotPlusMinus1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectref_in_unaryExpressionNotPlusMinus1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_unaryExpressionNotPlusMinus1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_unaryExpressionNotPlusMinus1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectref_in_propertyAccess1645 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_propertyAccess1650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_propertyAccess1655 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_objectref_in_methodInvocation1688 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_methodInvocation1693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Identifier_in_methodInvocation1699 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_methodInvocation1701 = new BitSet(new long[]{0x0C400318000001F0L});
    public static final BitSet FOLLOW_expressionList_in_methodInvocation1707 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_methodInvocation1711 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_Identifier_in_objectref1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_objectref1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_objectref1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_castExpression1809 = new BitSet(new long[]{0x00000003FC000010L});
    public static final BitSet FOLLOW_primitiveType_in_castExpression1815 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_castExpression1817 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_unaryExpression_in_castExpression1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_castExpression1834 = new BitSet(new long[]{0x00000003FC000010L});
    public static final BitSet FOLLOW_type_in_castExpression1840 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_castExpression1842 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_castExpression1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_arguments1870 = new BitSet(new long[]{0x0C400318000001F0L});
    public static final BitSet FOLLOW_expressionList_in_arguments1872 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_arguments1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred36_Mandarax1205 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred36_Mandarax1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred37_Mandarax1241 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred37_Mandarax1243 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred37_Mandarax1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred38_Mandarax1283 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred38_Mandarax1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_synpred47_Mandarax1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodInvocation_in_synpred48_Mandarax1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyAccess_in_synpred49_Mandarax1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectref_in_synpred50_Mandarax1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_synpred51_Mandarax1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred57_Mandarax1809 = new BitSet(new long[]{0x00000003FC000010L});
    public static final BitSet FOLLOW_primitiveType_in_synpred57_Mandarax1815 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred57_Mandarax1817 = new BitSet(new long[]{0x0C400118000001F0L});
    public static final BitSet FOLLOW_unaryExpression_in_synpred57_Mandarax1823 = new BitSet(new long[]{0x0000000000000002L});

}