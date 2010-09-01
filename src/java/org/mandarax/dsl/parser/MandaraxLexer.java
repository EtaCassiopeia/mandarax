// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g 2010-09-02 09:48:51
 
	package org.mandarax.dsl.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MandaraxLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int FloatTypeSuffix=12;
    public static final int T__24=24;
    public static final int OctalLiteral=7;
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
    public static final int T__33=33;
    public static final int WS=20;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int UnicodeEscape=16;
    public static final int FloatingPointLiteral=13;
    public static final int JavaIDDigit=19;
    public static final int EscapeSequence=14;
    public static final int OctalEscape=17;
    public static final int Letter=18;

      protected boolean enumIsKeyword = true;
      protected boolean assertIsKeyword = true;


    // delegates
    // delegators

    public MandaraxLexer() {;} 
    public MandaraxLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MandaraxLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g"; }

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:11:7: ( '[' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:11:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:12:7: ( ']' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:12:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:13:7: ( '.' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:13:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:14:7: ( 'boolean' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:14:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:15:7: ( 'char' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:15:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:16:7: ( 'byte' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:16:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:17:7: ( 'short' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:17:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:18:7: ( 'int' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:18:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:19:7: ( 'long' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:19:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:20:7: ( 'float' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:20:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:21:7: ( 'double' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:21:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:22:7: ( ',' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:23:7: ( 'true' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:23:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:24:7: ( 'false' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:24:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:25:7: ( '=' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:25:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:26:7: ( '{' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:26:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:27:7: ( '}' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:27:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:28:7: ( '(' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:29:7: ( ')' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:30:7: ( '?' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:30:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:31:7: ( ':' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:31:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:32:7: ( '|' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:32:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:33:7: ( '&' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:33:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:34:7: ( '==' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:34:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:35:7: ( '!=' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:35:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:36:7: ( 'instanceof' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:36:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:37:7: ( '<=' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:37:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:38:7: ( '>=' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:38:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:39:7: ( '<' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:39:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:40:7: ( '>' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:40:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:41:7: ( '+' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:41:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:42:7: ( '-' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:42:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:43:7: ( '*' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:43:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:44:7: ( '/' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:44:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:45:7: ( '%' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:45:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:46:7: ( '~' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:46:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:47:7: ( '!' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:47:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "HexLiteral"
    public final void mHexLiteral() throws RecognitionException {
        try {
            int _type = HexLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:229:12: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )? )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:229:14: '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )?
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:229:28: ( HexDigit )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:229:28: HexDigit
            	    {
            	    mHexDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:229:38: ( IntegerTypeSuffix )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='L'||LA2_0=='l') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:229:38: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HexLiteral"

    // $ANTLR start "DecimalLiteral"
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            int _type = DecimalLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:231:16: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )? )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:231:18: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )?
            {
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:231:18: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:231:19: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:231:25: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:231:34: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:231:34: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:231:45: ( IntegerTypeSuffix )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='L'||LA5_0=='l') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:231:45: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DecimalLiteral"

    // $ANTLR start "OctalLiteral"
    public final void mOctalLiteral() throws RecognitionException {
        try {
            int _type = OctalLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:233:14: ( '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )? )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:233:16: '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )?
            {
            match('0'); 
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:233:20: ( '0' .. '7' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='7')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:233:21: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:233:32: ( IntegerTypeSuffix )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='L'||LA7_0=='l') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:233:32: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OctalLiteral"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:236:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:236:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "IntegerTypeSuffix"
    public final void mIntegerTypeSuffix() throws RecognitionException {
        try {
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:239:19: ( ( 'l' | 'L' ) )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:239:21: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "IntegerTypeSuffix"

    // $ANTLR start "FloatingPointLiteral"
    public final void mFloatingPointLiteral() throws RecognitionException {
        try {
            int _type = FloatingPointLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:242:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix )
            int alt18=4;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:242:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )?
                    {
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:242:9: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:242:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    match('.'); 
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:242:25: ( '0' .. '9' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:242:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:242:37: ( Exponent )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:242:37: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:242:47: ( FloatTypeSuffix )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='D'||LA11_0=='F'||LA11_0=='d'||LA11_0=='f') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:242:47: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:243:9: '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
                    {
                    match('.'); 
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:243:13: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:243:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:243:25: ( Exponent )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='E'||LA13_0=='e') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:243:25: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:243:35: ( FloatTypeSuffix )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='D'||LA14_0=='F'||LA14_0=='d'||LA14_0=='f') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:243:35: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:244:9: ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )?
                    {
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:244:9: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:244:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    mExponent(); 
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:244:30: ( FloatTypeSuffix )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='D'||LA16_0=='F'||LA16_0=='d'||LA16_0=='f') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:244:30: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:245:9: ( '0' .. '9' )+ FloatTypeSuffix
                    {
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:245:9: ( '0' .. '9' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:245:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    mFloatTypeSuffix(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FloatingPointLiteral"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:249:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:249:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:249:22: ( '+' | '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='+'||LA19_0=='-') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:249:33: ( '0' .. '9' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:249:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "FloatTypeSuffix"
    public final void mFloatTypeSuffix() throws RecognitionException {
        try {
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:252:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:252:19: ( 'f' | 'F' | 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "FloatTypeSuffix"

    // $ANTLR start "CharacterLiteral"
    public final void mCharacterLiteral() throws RecognitionException {
        try {
            int _type = CharacterLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:255:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:255:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:255:14: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\\') ) {
                alt21=1;
            }
            else if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:255:16: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:255:33: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CharacterLiteral"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:259:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:259:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:259:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\\') ) {
                    alt22=1;
                }
                else if ( ((LA22_0>='\u0000' && LA22_0<='!')||(LA22_0>='#' && LA22_0<='[')||(LA22_0>=']' && LA22_0<='\uFFFF')) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:259:14: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:259:31: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:264:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt23=1;
                    }
                    break;
                case 'u':
                    {
                    alt23=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt23=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:264:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:265:9: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:266:9: OctalEscape
                    {
                    mOctalEscape(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
        try {
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:271:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\\') ) {
                int LA24_1 = input.LA(2);

                if ( ((LA24_1>='0' && LA24_1<='3')) ) {
                    int LA24_2 = input.LA(3);

                    if ( ((LA24_2>='0' && LA24_2<='7')) ) {
                        int LA24_5 = input.LA(4);

                        if ( ((LA24_5>='0' && LA24_5<='7')) ) {
                            alt24=1;
                        }
                        else {
                            alt24=2;}
                    }
                    else {
                        alt24=3;}
                }
                else if ( ((LA24_1>='4' && LA24_1<='7')) ) {
                    int LA24_3 = input.LA(3);

                    if ( ((LA24_3>='0' && LA24_3<='7')) ) {
                        alt24=2;
                    }
                    else {
                        alt24=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:271:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:271:14: ( '0' .. '3' )
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:271:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:271:25: ( '0' .. '7' )
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:271:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:271:36: ( '0' .. '7' )
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:271:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:272:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:272:14: ( '0' .. '7' )
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:272:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:272:25: ( '0' .. '7' )
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:272:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:273:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:273:14: ( '0' .. '7' )
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:273:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:278:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:278:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('\\'); 
            match('u'); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:283:5: ( Letter ( Letter | JavaIDDigit )* )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:283:9: Letter ( Letter | JavaIDDigit )*
            {
            mLetter(); 
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:283:16: ( Letter | JavaIDDigit )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='$'||(LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='z')||(LA25_0>='\u00C0' && LA25_0<='\u00D6')||(LA25_0>='\u00D8' && LA25_0<='\u00F6')||(LA25_0>='\u00F8' && LA25_0<='\u1FFF')||(LA25_0>='\u3040' && LA25_0<='\u318F')||(LA25_0>='\u3300' && LA25_0<='\u337F')||(LA25_0>='\u3400' && LA25_0<='\u3D2D')||(LA25_0>='\u4E00' && LA25_0<='\u9FFF')||(LA25_0>='\uF900' && LA25_0<='\uFAFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:291:5: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "JavaIDDigit"
    public final void mJavaIDDigit() throws RecognitionException {
        try {
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:308:5: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='\u0660' && input.LA(1)<='\u0669')||(input.LA(1)>='\u06F0' && input.LA(1)<='\u06F9')||(input.LA(1)>='\u0966' && input.LA(1)<='\u096F')||(input.LA(1)>='\u09E6' && input.LA(1)<='\u09EF')||(input.LA(1)>='\u0A66' && input.LA(1)<='\u0A6F')||(input.LA(1)>='\u0AE6' && input.LA(1)<='\u0AEF')||(input.LA(1)>='\u0B66' && input.LA(1)<='\u0B6F')||(input.LA(1)>='\u0BE7' && input.LA(1)<='\u0BEF')||(input.LA(1)>='\u0C66' && input.LA(1)<='\u0C6F')||(input.LA(1)>='\u0CE6' && input.LA(1)<='\u0CEF')||(input.LA(1)>='\u0D66' && input.LA(1)<='\u0D6F')||(input.LA(1)>='\u0E50' && input.LA(1)<='\u0E59')||(input.LA(1)>='\u0ED0' && input.LA(1)<='\u0ED9')||(input.LA(1)>='\u1040' && input.LA(1)<='\u1049') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "JavaIDDigit"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:325:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:325:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:329:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:329:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:329:14: ( options {greedy=false; } : . )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='*') ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1=='/') ) {
                        alt26=2;
                    }
                    else if ( ((LA26_1>='\u0000' && LA26_1<='.')||(LA26_1>='0' && LA26_1<='\uFFFF')) ) {
                        alt26=1;
                    }


                }
                else if ( ((LA26_0>='\u0000' && LA26_0<=')')||(LA26_0>='+' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:329:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:333:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:333:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:333:12: (~ ( '\\n' | '\\r' ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\u0000' && LA27_0<='\t')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:333:12: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:333:26: ( '\\r' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\r') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:333:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:8: ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | HexLiteral | DecimalLiteral | OctalLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | Identifier | WS | COMMENT | LINE_COMMENT )
        int alt29=47;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:10: T__23
                {
                mT__23(); 

                }
                break;
            case 2 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:16: T__24
                {
                mT__24(); 

                }
                break;
            case 3 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:22: T__25
                {
                mT__25(); 

                }
                break;
            case 4 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:28: T__26
                {
                mT__26(); 

                }
                break;
            case 5 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:34: T__27
                {
                mT__27(); 

                }
                break;
            case 6 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:40: T__28
                {
                mT__28(); 

                }
                break;
            case 7 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:46: T__29
                {
                mT__29(); 

                }
                break;
            case 8 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:52: T__30
                {
                mT__30(); 

                }
                break;
            case 9 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:58: T__31
                {
                mT__31(); 

                }
                break;
            case 10 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:64: T__32
                {
                mT__32(); 

                }
                break;
            case 11 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:70: T__33
                {
                mT__33(); 

                }
                break;
            case 12 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:76: T__34
                {
                mT__34(); 

                }
                break;
            case 13 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:82: T__35
                {
                mT__35(); 

                }
                break;
            case 14 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:88: T__36
                {
                mT__36(); 

                }
                break;
            case 15 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:94: T__37
                {
                mT__37(); 

                }
                break;
            case 16 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:100: T__38
                {
                mT__38(); 

                }
                break;
            case 17 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:106: T__39
                {
                mT__39(); 

                }
                break;
            case 18 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:112: T__40
                {
                mT__40(); 

                }
                break;
            case 19 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:118: T__41
                {
                mT__41(); 

                }
                break;
            case 20 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:124: T__42
                {
                mT__42(); 

                }
                break;
            case 21 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:130: T__43
                {
                mT__43(); 

                }
                break;
            case 22 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:136: T__44
                {
                mT__44(); 

                }
                break;
            case 23 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:142: T__45
                {
                mT__45(); 

                }
                break;
            case 24 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:148: T__46
                {
                mT__46(); 

                }
                break;
            case 25 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:154: T__47
                {
                mT__47(); 

                }
                break;
            case 26 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:160: T__48
                {
                mT__48(); 

                }
                break;
            case 27 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:166: T__49
                {
                mT__49(); 

                }
                break;
            case 28 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:172: T__50
                {
                mT__50(); 

                }
                break;
            case 29 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:178: T__51
                {
                mT__51(); 

                }
                break;
            case 30 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:184: T__52
                {
                mT__52(); 

                }
                break;
            case 31 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:190: T__53
                {
                mT__53(); 

                }
                break;
            case 32 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:196: T__54
                {
                mT__54(); 

                }
                break;
            case 33 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:202: T__55
                {
                mT__55(); 

                }
                break;
            case 34 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:208: T__56
                {
                mT__56(); 

                }
                break;
            case 35 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:214: T__57
                {
                mT__57(); 

                }
                break;
            case 36 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:220: T__58
                {
                mT__58(); 

                }
                break;
            case 37 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:226: T__59
                {
                mT__59(); 

                }
                break;
            case 38 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:232: HexLiteral
                {
                mHexLiteral(); 

                }
                break;
            case 39 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:243: DecimalLiteral
                {
                mDecimalLiteral(); 

                }
                break;
            case 40 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:258: OctalLiteral
                {
                mOctalLiteral(); 

                }
                break;
            case 41 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:271: FloatingPointLiteral
                {
                mFloatingPointLiteral(); 

                }
                break;
            case 42 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:292: CharacterLiteral
                {
                mCharacterLiteral(); 

                }
                break;
            case 43 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:309: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 44 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:323: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 45 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:334: WS
                {
                mWS(); 

                }
                break;
            case 46 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:337: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 47 :
                // /Users/jbdietri/development/gql4jung/workspace/express/grammar/Mandarax.g:1:345: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA18_eotS =
        "\6\uffff";
    static final String DFA18_eofS =
        "\6\uffff";
    static final String DFA18_minS =
        "\2\56\4\uffff";
    static final String DFA18_maxS =
        "\1\71\1\146\4\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\1";
    static final String DFA18_specialS =
        "\6\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\5\1\uffff\12\1\12\uffff\1\4\1\3\1\4\35\uffff\1\4\1\3\1\4",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "241:1: FloatingPointLiteral : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix );";
        }
    }
    static final String DFA29_eotS =
        "\3\uffff\1\46\7\43\1\uffff\1\43\1\62\10\uffff\1\64\1\66\1\70\3\uffff"+
        "\1\73\2\uffff\2\76\6\uffff\12\43\14\uffff\1\113\1\uffff\1\76\4\43"+
        "\1\120\6\43\1\uffff\1\43\1\130\1\131\1\43\1\uffff\1\43\1\134\3\43"+
        "\1\140\1\43\2\uffff\1\142\1\43\1\uffff\1\144\1\145\1\43\1\uffff"+
        "\1\43\1\uffff\1\43\2\uffff\1\151\1\152\1\43\2\uffff\2\43\1\156\1"+
        "\uffff";
    static final String DFA29_eofS =
        "\157\uffff";
    static final String DFA29_minS =
        "\1\11\2\uffff\1\60\1\157\2\150\1\156\1\157\1\141\1\157\1\uffff\1"+
        "\162\1\75\10\uffff\3\75\3\uffff\1\52\2\uffff\2\56\6\uffff\1\157"+
        "\1\164\1\141\1\157\1\163\1\156\1\157\1\154\2\165\14\uffff\1\56\1"+
        "\uffff\1\56\1\154\1\145\2\162\1\44\1\164\1\147\1\141\1\163\1\142"+
        "\1\145\1\uffff\1\145\2\44\1\164\1\uffff\1\141\1\44\1\164\1\145\1"+
        "\154\1\44\1\141\2\uffff\1\44\1\156\1\uffff\2\44\1\145\1\uffff\1"+
        "\156\1\uffff\1\143\2\uffff\2\44\1\145\2\uffff\1\157\1\146\1\44\1"+
        "\uffff";
    static final String DFA29_maxS =
        "\1\ufaff\2\uffff\1\71\1\171\2\150\1\156\1\157\1\154\1\157\1\uffff"+
        "\1\162\1\75\10\uffff\3\75\3\uffff\1\57\2\uffff\1\170\1\146\6\uffff"+
        "\1\157\1\164\1\141\1\157\1\164\1\156\1\157\1\154\2\165\14\uffff"+
        "\1\146\1\uffff\1\146\1\154\1\145\2\162\1\ufaff\1\164\1\147\1\141"+
        "\1\163\1\142\1\145\1\uffff\1\145\2\ufaff\1\164\1\uffff\1\141\1\ufaff"+
        "\1\164\1\145\1\154\1\ufaff\1\141\2\uffff\1\ufaff\1\156\1\uffff\2"+
        "\ufaff\1\145\1\uffff\1\156\1\uffff\1\143\2\uffff\2\ufaff\1\145\2"+
        "\uffff\1\157\1\146\1\ufaff\1\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\2\10\uffff\1\14\2\uffff\1\20\1\21\1\22\1\23\1\24"+
        "\1\25\1\26\1\27\3\uffff\1\37\1\40\1\41\1\uffff\1\43\1\44\2\uffff"+
        "\1\52\1\53\1\54\1\55\1\51\1\3\12\uffff\1\30\1\17\1\31\1\45\1\33"+
        "\1\35\1\34\1\36\1\56\1\57\1\42\1\46\1\uffff\1\47\14\uffff\1\50\4"+
        "\uffff\1\10\7\uffff\1\6\1\5\2\uffff\1\11\3\uffff\1\15\1\uffff\1"+
        "\7\1\uffff\1\12\1\16\3\uffff\1\13\1\4\3\uffff\1\32";
    static final String DFA29_specialS =
        "\157\uffff}>";
    static final String[] DFA29_transitionS = {
            "\2\44\1\uffff\2\44\22\uffff\1\44\1\26\1\42\1\uffff\1\43\1\35"+
            "\1\25\1\41\1\20\1\21\1\33\1\31\1\13\1\32\1\3\1\34\1\37\11\40"+
            "\1\23\1\uffff\1\27\1\15\1\30\1\22\1\uffff\32\43\1\1\1\uffff"+
            "\1\2\1\uffff\1\43\1\uffff\1\43\1\4\1\5\1\12\1\43\1\11\2\43\1"+
            "\7\2\43\1\10\6\43\1\6\1\14\6\43\1\16\1\24\1\17\1\36\101\uffff"+
            "\27\43\1\uffff\37\43\1\uffff\u1f08\43\u1040\uffff\u0150\43\u0170"+
            "\uffff\u0080\43\u0080\uffff\u092e\43\u10d2\uffff\u5200\43\u5900"+
            "\uffff\u0200\43",
            "",
            "",
            "\12\45",
            "\1\47\11\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\56\12\uffff\1\55",
            "\1\57",
            "",
            "\1\60",
            "\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "\1\65",
            "\1\67",
            "",
            "",
            "",
            "\1\71\4\uffff\1\72",
            "",
            "",
            "\1\45\1\uffff\10\75\2\45\12\uffff\3\45\21\uffff\1\74\13\uffff"+
            "\3\45\21\uffff\1\74",
            "\1\45\1\uffff\12\77\12\uffff\3\45\35\uffff\3\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\105\1\104",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
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
            "",
            "\1\45\1\uffff\10\75\2\45\12\uffff\3\45\35\uffff\3\45",
            "",
            "\1\45\1\uffff\12\77\12\uffff\3\45\35\uffff\3\45",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43\105\uffff\27\43\1\uffff\37\43\1\uffff\u1f08\43\u1040\uffff"+
            "\u0150\43\u0170\uffff\u0080\43\u0080\uffff\u092e\43\u10d2\uffff"+
            "\u5200\43\u5900\uffff\u0200\43",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43\105\uffff\27\43\1\uffff\37\43\1\uffff\u1f08\43\u1040\uffff"+
            "\u0150\43\u0170\uffff\u0080\43\u0080\uffff\u092e\43\u10d2\uffff"+
            "\u5200\43\u5900\uffff\u0200\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43\105\uffff\27\43\1\uffff\37\43\1\uffff\u1f08\43\u1040\uffff"+
            "\u0150\43\u0170\uffff\u0080\43\u0080\uffff\u092e\43\u10d2\uffff"+
            "\u5200\43\u5900\uffff\u0200\43",
            "\1\132",
            "",
            "\1\133",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43\105\uffff\27\43\1\uffff\37\43\1\uffff\u1f08\43\u1040\uffff"+
            "\u0150\43\u0170\uffff\u0080\43\u0080\uffff\u092e\43\u10d2\uffff"+
            "\u5200\43\u5900\uffff\u0200\43",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43\105\uffff\27\43\1\uffff\37\43\1\uffff\u1f08\43\u1040\uffff"+
            "\u0150\43\u0170\uffff\u0080\43\u0080\uffff\u092e\43\u10d2\uffff"+
            "\u5200\43\u5900\uffff\u0200\43",
            "\1\141",
            "",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43\105\uffff\27\43\1\uffff\37\43\1\uffff\u1f08\43\u1040\uffff"+
            "\u0150\43\u0170\uffff\u0080\43\u0080\uffff\u092e\43\u10d2\uffff"+
            "\u5200\43\u5900\uffff\u0200\43",
            "\1\143",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43\105\uffff\27\43\1\uffff\37\43\1\uffff\u1f08\43\u1040\uffff"+
            "\u0150\43\u0170\uffff\u0080\43\u0080\uffff\u092e\43\u10d2\uffff"+
            "\u5200\43\u5900\uffff\u0200\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43\105\uffff\27\43\1\uffff\37\43\1\uffff\u1f08\43\u1040\uffff"+
            "\u0150\43\u0170\uffff\u0080\43\u0080\uffff\u092e\43\u10d2\uffff"+
            "\u5200\43\u5900\uffff\u0200\43",
            "\1\146",
            "",
            "\1\147",
            "",
            "\1\150",
            "",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43\105\uffff\27\43\1\uffff\37\43\1\uffff\u1f08\43\u1040\uffff"+
            "\u0150\43\u0170\uffff\u0080\43\u0080\uffff\u092e\43\u10d2\uffff"+
            "\u5200\43\u5900\uffff\u0200\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43\105\uffff\27\43\1\uffff\37\43\1\uffff\u1f08\43\u1040\uffff"+
            "\u0150\43\u0170\uffff\u0080\43\u0080\uffff\u092e\43\u10d2\uffff"+
            "\u5200\43\u5900\uffff\u0200\43",
            "\1\153",
            "",
            "",
            "\1\154",
            "\1\155",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43\105\uffff\27\43\1\uffff\37\43\1\uffff\u1f08\43\u1040\uffff"+
            "\u0150\43\u0170\uffff\u0080\43\u0080\uffff\u092e\43\u10d2\uffff"+
            "\u5200\43\u5900\uffff\u0200\43",
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
            return "1:1: Tokens : ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | HexLiteral | DecimalLiteral | OctalLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | Identifier | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}