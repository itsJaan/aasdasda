/* The following code was generated by JFlex 1.4.3 on 17/3/21 22:46 */

package proyectocompiladores;
import static proyectocompiladores.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 17/3/21 22:46 from the specification file
 * <tt>C:/Users/willi/OneDrive/Documents/proyectoCompiladores/Proyecto_Compiladores_I/src/proyectocompiladores/Analizador_Lexico.flex</tt>
 */
public class Analizador_Lexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\6\1\10\2\0\1\13\22\0\1\6\1\0\1\7\2\0"+
    "\1\5\1\14\1\11\2\12\2\5\1\12\1\5\1\12\1\5\12\1"+
    "\2\0\3\3\2\0\1\35\1\25\1\27\1\30\1\31\1\32\1\37"+
    "\1\41\1\15\1\2\1\43\1\26\1\16\1\36\1\20\1\17\1\2"+
    "\1\21\1\23\1\22\1\24\1\34\1\40\1\42\1\33\1\2\3\0"+
    "\1\5\1\2\1\0\1\35\1\25\1\27\1\30\1\31\1\32\1\37"+
    "\1\41\1\15\1\2\1\43\1\26\1\16\1\36\1\20\1\17\1\2"+
    "\1\21\1\23\1\22\1\24\1\34\1\40\1\42\1\33\1\2\1\12"+
    "\1\4\1\12\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\3\1\5\1\6"+
    "\1\7\1\10\2\7\1\6\1\11\21\3\1\12\2\3"+
    "\2\12\1\3\1\12\10\3\1\0\1\13\1\12\10\3"+
    "\1\12\15\3\1\12\6\3\1\12\6\3\1\12\3\3"+
    "\2\12\2\3\1\12\1\3\1\12\5\3\2\12\6\3"+
    "\1\12\12\3\1\12\2\3\1\14\3\12\5\3\1\12"+
    "\4\3\2\12\3\3\1\12\2\3\1\12\2\3\1\12"+
    "\2\3\1\12\1\3\3\12\7\3\1\12\1\3\1\12"+
    "\3\3\2\12\2\3\4\12\3\3\1\12\2\3\1\12"+
    "\3\3\1\12\3\3\2\12\3\3\1\12\3\3\1\12"+
    "\1\3\1\12\3\3\2\12\2\3\1\12\6\3\1\12"+
    "\3\3\2\12\1\3\1\12\1\3\2\12\2\3\1\12"+
    "\1\3\3\12\1\3\2\12\1\3\1\12";

  private static int [] zzUnpackAction() {
    int [] result = new int[240];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\44\0\110\0\154\0\44\0\220\0\44\0\264"+
    "\0\330\0\374\0\u0120\0\44\0\u0144\0\44\0\u0168\0\u018c"+
    "\0\u01b0\0\u01d4\0\u01f8\0\u021c\0\u0240\0\u0264\0\u0288\0\u02ac"+
    "\0\u02d0\0\u02f4\0\u0318\0\u033c\0\u0360\0\u0384\0\u03a8\0\u03cc"+
    "\0\u03f0\0\u0414\0\u0438\0\u045c\0\u0480\0\154\0\u04a4\0\u04c8"+
    "\0\u04ec\0\u0510\0\u0534\0\u0558\0\u057c\0\u05a0\0\u05c4\0\u0120"+
    "\0\u05e8\0\u060c\0\u0630\0\u0654\0\u0678\0\u069c\0\u06c0\0\u06e4"+
    "\0\u0708\0\u072c\0\u0750\0\u0774\0\u0798\0\u07bc\0\u07e0\0\u0804"+
    "\0\u0828\0\u084c\0\u0870\0\u0894\0\u08b8\0\u08dc\0\u0900\0\u0924"+
    "\0\u0924\0\u0948\0\u096c\0\u0990\0\u09b4\0\u09d8\0\u096c\0\u09fc"+
    "\0\u0a20\0\u0a44\0\u0a68\0\u0a8c\0\u0ab0\0\u0ad4\0\u0af8\0\u0b1c"+
    "\0\u0b40\0\u0b64\0\u0b88\0\u0bac\0\u0bd0\0\u0bf4\0\u0c18\0\u0c3c"+
    "\0\u0c60\0\u0c84\0\u0ca8\0\u0ccc\0\u0cf0\0\u0bd0\0\u0d14\0\u0d38"+
    "\0\u0d5c\0\u0d80\0\u0da4\0\u0b64\0\u0dc8\0\u0dec\0\u0e10\0\u0e34"+
    "\0\u0e58\0\u0e7c\0\u0ea0\0\u0ec4\0\u0ee8\0\u0f0c\0\u0f30\0\u0f54"+
    "\0\u0f78\0\u0f9c\0\u0fc0\0\u05c4\0\u0fe4\0\u1008\0\u102c\0\u1050"+
    "\0\u1074\0\u0bf4\0\u1098\0\u10bc\0\u10e0\0\u1104\0\u1128\0\u114c"+
    "\0\u1170\0\u1194\0\u11b8\0\u11dc\0\u1200\0\u1224\0\u1248\0\u126c"+
    "\0\u1290\0\u12b4\0\u12d8\0\u12fc\0\u1320\0\u1344\0\u1368\0\u138c"+
    "\0\u13b0\0\u13d4\0\u13f8\0\u141c\0\u141c\0\u1440\0\u1464\0\u1488"+
    "\0\u14ac\0\u14d0\0\u14f4\0\u1518\0\u153c\0\u1560\0\u1584\0\u15a8"+
    "\0\u15cc\0\u15f0\0\u1614\0\u13f8\0\u1614\0\u1440\0\u1638\0\u1584"+
    "\0\u165c\0\u1680\0\u16a4\0\u16c8\0\u0fc0\0\u16ec\0\u165c\0\u1710"+
    "\0\u1734\0\u1758\0\u177c\0\u17a0\0\u17c4\0\u17e8\0\u180c\0\u1830"+
    "\0\u1854\0\u1878\0\u189c\0\u18c0\0\u189c\0\u18e4\0\u1908\0\u192c"+
    "\0\u1950\0\u1974\0\u1998\0\u19bc\0\u19e0\0\u1a04\0\u1a28\0\u1368"+
    "\0\u1998\0\u1a4c\0\u1a70\0\u1a94\0\u1ab8\0\u1adc\0\u1a28\0\u1b00"+
    "\0\u1b24\0\u18c0\0\u1b48\0\u1b6c\0\u1b90\0\u180c\0\u1bb4\0\u1bd8"+
    "\0\u1bfc\0\u1830\0\u01d4\0\u1c20\0\u1c20\0\u1c44\0\u1c68\0\u1c68"+
    "\0\u1b24\0\u19bc\0\u0f30\0\u1c8c\0\u10bc\0\u1c44\0\u1cb0\0\u1cd4";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[240];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\2\4\1\35\1\36\1\4\1\37"+
    "\3\4\45\0\1\3\43\0\2\4\1\0\1\4\10\0"+
    "\27\4\1\0\2\4\1\0\1\40\10\0\1\41\1\42"+
    "\1\4\1\43\1\44\1\45\1\46\1\47\1\4\1\50"+
    "\2\4\1\51\1\46\1\52\1\4\1\53\1\54\2\4"+
    "\1\55\1\56\1\4\6\0\1\10\4\0\1\10\30\0"+
    "\10\57\1\0\33\57\10\0\1\12\2\0\1\12\30\0"+
    "\10\60\1\0\33\60\6\0\1\10\1\0\1\12\2\0"+
    "\1\15\31\0\2\4\1\0\1\61\10\0\1\4\1\42"+
    "\13\4\1\46\3\4\1\62\5\4\1\0\2\4\1\0"+
    "\1\63\10\0\3\4\1\64\14\4\1\65\6\4\1\0"+
    "\2\4\1\0\1\66\10\0\4\4\1\67\2\4\1\70"+
    "\17\4\1\0\2\4\1\0\1\46\10\0\4\4\1\46"+
    "\22\4\1\0\2\4\1\0\1\71\10\0\14\4\1\71"+
    "\12\4\1\0\2\4\1\0\1\72\10\0\3\4\1\46"+
    "\1\73\17\4\1\74\2\4\1\0\2\4\1\0\1\75"+
    "\10\0\5\4\1\45\1\4\1\76\6\4\1\77\10\4"+
    "\1\0\2\4\1\0\1\100\10\0\21\4\1\100\5\4"+
    "\1\0\2\4\1\0\1\101\10\0\3\4\1\102\12\4"+
    "\1\103\10\4\1\0\2\4\1\0\1\104\10\0\1\105"+
    "\2\4\1\106\23\4\1\0\2\4\1\0\1\107\10\0"+
    "\3\4\1\107\23\4\1\0\2\4\1\0\1\110\10\0"+
    "\1\111\2\4\1\46\23\4\1\0\2\4\1\0\1\112"+
    "\10\0\11\4\1\50\7\4\1\113\3\4\1\56\1\4"+
    "\1\0\2\4\1\0\1\114\10\0\3\4\1\22\3\4"+
    "\1\115\10\4\1\116\6\4\1\0\2\4\1\0\1\117"+
    "\10\0\6\4\1\46\12\4\1\113\5\4\1\0\2\4"+
    "\1\0\1\120\10\0\7\4\1\121\4\4\1\122\12\4"+
    "\1\0\2\4\1\0\1\123\10\0\4\4\1\124\17\4"+
    "\1\125\2\4\1\0\2\4\1\0\1\126\10\0\1\127"+
    "\1\46\1\130\1\131\1\132\1\133\1\134\1\135\1\136"+
    "\1\137\1\4\1\140\1\141\2\4\1\142\1\143\1\144"+
    "\3\4\1\145\1\135\1\0\2\4\1\0\1\146\10\0"+
    "\1\4\1\46\24\4\1\135\1\0\2\4\1\0\1\130"+
    "\10\0\2\4\1\130\24\4\1\0\2\4\1\0\1\147"+
    "\10\0\3\4\1\131\1\46\6\4\1\140\5\4\1\150"+
    "\5\4\1\0\2\4\1\0\1\151\10\0\1\152\6\4"+
    "\1\135\17\4\1\0\2\4\1\0\1\153\10\0\4\4"+
    "\1\154\7\4\1\155\12\4\1\0\2\4\1\0\1\156"+
    "\10\0\10\4\1\136\1\157\7\4\1\160\5\4\1\0"+
    "\2\4\1\0\1\161\10\0\6\4\1\161\20\4\1\0"+
    "\2\4\1\0\1\162\10\0\5\4\1\163\12\4\1\143"+
    "\4\4\1\145\1\4\1\0\2\4\1\0\1\164\10\0"+
    "\6\4\1\165\10\4\1\142\7\4\1\0\2\4\1\0"+
    "\1\166\10\0\1\167\10\4\1\170\15\4\1\0\2\4"+
    "\1\0\1\171\10\0\5\4\1\171\5\4\1\46\13\4"+
    "\1\0\2\4\1\0\1\172\10\0\1\173\13\4\1\167"+
    "\12\4\1\0\2\4\1\0\1\145\10\0\1\145\26\4"+
    "\7\57\1\174\1\0\33\57\1\0\2\4\1\0\1\175"+
    "\10\0\2\4\1\130\2\4\1\176\21\4\1\0\2\4"+
    "\1\0\1\176\10\0\5\4\1\176\21\4\1\0\2\4"+
    "\1\0\1\177\10\0\1\167\12\4\1\140\13\4\1\0"+
    "\2\4\1\0\1\140\10\0\13\4\1\140\13\4\1\0"+
    "\2\4\1\0\1\167\10\0\1\167\26\4\1\0\2\4"+
    "\1\0\1\200\10\0\1\201\7\4\1\202\16\4\1\0"+
    "\2\4\1\0\1\201\10\0\1\201\26\4\1\0\2\4"+
    "\1\0\1\202\10\0\10\4\1\202\16\4\1\0\2\4"+
    "\1\0\1\203\10\0\5\4\1\163\12\4\1\143\6\4"+
    "\1\0\2\4\1\0\1\204\10\0\7\4\1\135\4\4"+
    "\1\167\12\4\1\0\2\4\1\0\1\135\10\0\7\4"+
    "\1\135\17\4\1\0\2\4\1\0\1\167\10\0\14\4"+
    "\1\167\12\4\1\0\2\4\1\0\1\205\10\0\4\4"+
    "\1\154\1\4\1\165\1\4\1\46\3\4\1\155\12\4"+
    "\1\0\2\4\1\0\1\46\10\0\10\4\1\46\16\4"+
    "\1\0\2\4\1\0\1\165\10\0\6\4\1\165\20\4"+
    "\1\0\2\4\1\0\1\206\10\0\5\4\1\206\21\4"+
    "\1\0\2\4\1\0\1\207\10\0\3\4\1\210\13\4"+
    "\1\142\7\4\1\0\2\4\1\0\1\210\10\0\3\4"+
    "\1\210\23\4\1\0\2\4\1\0\1\142\10\0\17\4"+
    "\1\142\7\4\1\0\2\4\1\0\1\211\10\0\3\4"+
    "\1\155\22\4\1\135\1\0\2\4\1\0\1\135\10\0"+
    "\26\4\1\135\1\0\2\4\1\0\1\155\10\0\3\4"+
    "\1\155\23\4\1\0\2\4\1\0\1\150\10\0\21\4"+
    "\1\150\5\4\1\0\2\4\1\0\1\46\10\0\1\4"+
    "\1\46\25\4\1\0\2\4\1\0\1\212\10\0\1\145"+
    "\5\4\1\161\4\4\1\46\13\4\1\0\2\4\1\0"+
    "\1\46\10\0\13\4\1\46\13\4\1\0\2\4\1\0"+
    "\1\213\10\0\4\4\1\46\4\4\1\170\7\4\1\160"+
    "\5\4\1\0\2\4\1\0\1\160\10\0\21\4\1\160"+
    "\5\4\1\0\2\4\1\0\1\170\10\0\11\4\1\170"+
    "\15\4\1\0\2\4\1\0\1\214\10\0\11\4\1\157"+
    "\13\4\1\145\1\4\1\0\2\4\1\0\1\157\10\0"+
    "\11\4\1\157\15\4\1\0\2\4\1\0\1\145\10\0"+
    "\25\4\1\145\1\4\1\0\2\4\1\0\1\215\10\0"+
    "\1\215\26\4\1\0\2\4\1\0\1\216\10\0\1\216"+
    "\26\4\1\0\2\4\1\0\1\173\10\0\1\173\26\4"+
    "\1\0\2\4\1\0\1\217\10\0\1\220\1\4\1\46"+
    "\1\221\1\4\1\222\1\223\1\224\1\4\1\225\1\226"+
    "\1\227\1\230\2\4\1\231\1\157\1\46\5\4\1\0"+
    "\2\4\1\0\1\232\10\0\5\4\1\233\3\4\1\135"+
    "\5\4\1\231\1\4\1\46\5\4\1\0\2\4\1\0"+
    "\1\221\10\0\3\4\1\221\23\4\1\0\2\4\1\0"+
    "\1\234\10\0\2\4\1\46\6\4\1\235\15\4\1\0"+
    "\2\4\1\0\1\236\10\0\1\237\6\4\1\240\17\4"+
    "\1\0\2\4\1\0\1\241\10\0\1\157\6\4\1\242"+
    "\4\4\1\243\12\4\1\0\2\4\1\0\1\244\10\0"+
    "\5\4\1\245\6\4\1\246\12\4\1\0\2\4\1\0"+
    "\1\46\10\0\14\4\1\46\12\4\1\0\2\4\1\0"+
    "\1\247\10\0\11\4\1\247\15\4\1\0\2\4\1\0"+
    "\1\146\10\0\6\4\1\135\2\4\1\46\15\4\1\0"+
    "\2\4\1\0\1\173\10\0\7\4\1\173\17\4\1\0"+
    "\2\4\1\0\1\46\10\0\2\4\1\46\16\4\1\46"+
    "\5\4\1\0\2\4\1\0\1\157\10\0\20\4\1\157"+
    "\6\4\1\0\2\4\1\0\1\227\10\0\13\4\1\227"+
    "\13\4\1\0\2\4\1\0\1\250\10\0\6\4\1\251"+
    "\3\4\1\226\14\4\1\0\2\4\1\0\1\46\10\0"+
    "\5\4\1\46\21\4\1\0\2\4\1\0\1\252\10\0"+
    "\2\4\1\46\3\4\1\251\1\173\1\4\1\235\15\4"+
    "\1\0\2\4\1\0\1\251\10\0\6\4\1\251\20\4"+
    "\1\0\2\4\1\0\1\253\10\0\5\4\1\254\6\4"+
    "\1\46\2\4\1\231\7\4\1\0\2\4\1\0\1\255"+
    "\10\0\5\4\1\254\11\4\1\231\7\4\1\0\2\4"+
    "\1\0\1\256\10\0\1\237\1\4\1\46\4\4\1\240"+
    "\17\4\1\0\2\4\1\0\1\46\10\0\2\4\1\46"+
    "\24\4\1\0\2\4\1\0\1\257\10\0\11\4\1\260"+
    "\1\226\14\4\1\0\2\4\1\0\1\46\10\0\11\4"+
    "\1\46\15\4\1\0\2\4\1\0\1\226\10\0\12\4"+
    "\1\226\14\4\1\0\2\4\1\0\1\246\10\0\14\4"+
    "\1\246\12\4\1\0\2\4\1\0\1\261\10\0\5\4"+
    "\1\46\1\4\1\242\3\4\1\227\13\4\1\0\2\4"+
    "\1\0\1\242\10\0\7\4\1\242\17\4\1\0\2\4"+
    "\1\0\1\262\10\0\5\4\1\245\12\4\1\157\6\4"+
    "\1\0\2\4\1\0\1\245\10\0\5\4\1\245\21\4"+
    "\1\0\2\4\1\0\1\146\10\0\6\4\1\135\12\4"+
    "\1\46\5\4\1\0\2\4\1\0\1\46\10\0\21\4"+
    "\1\46\5\4\1\0\2\4\1\0\1\135\10\0\6\4"+
    "\1\135\20\4\1\0\2\4\1\0\1\263\10\0\1\157"+
    "\13\4\1\243\12\4\1\0\2\4\1\0\1\146\10\0"+
    "\11\4\1\135\7\4\1\46\5\4\1\0\2\4\1\0"+
    "\1\135\10\0\11\4\1\135\15\4\1\0\2\4\1\0"+
    "\1\264\10\0\3\4\1\221\10\4\1\243\12\4\1\0"+
    "\2\4\1\0\1\243\10\0\14\4\1\243\12\4\1\0"+
    "\2\4\1\0\1\265\10\0\7\4\1\173\11\4\1\46"+
    "\5\4\1\0\2\4\1\0\1\266\10\0\11\4\1\247"+
    "\5\4\1\231\7\4\1\0\2\4\1\0\1\231\10\0"+
    "\17\4\1\231\7\4\1\0\2\4\1\0\1\267\10\0"+
    "\7\4\1\242\3\4\1\227\13\4\1\0\2\4\1\0"+
    "\1\46\10\0\14\4\1\46\4\4\1\46\5\4\1\0"+
    "\2\4\1\0\1\270\10\0\1\237\1\4\1\46\2\4"+
    "\1\245\1\4\1\240\17\4\1\0\2\4\1\0\1\157"+
    "\10\0\1\157\26\4\1\0\2\4\1\0\1\271\10\0"+
    "\11\4\1\235\6\4\1\157\6\4\1\0\2\4\1\0"+
    "\1\235\10\0\11\4\1\235\15\4\1\0\2\4\1\0"+
    "\1\46\10\0\2\4\1\46\11\4\1\46\12\4\1\0"+
    "\2\4\1\0\1\246\10\0\5\4\1\46\6\4\1\246"+
    "\12\4\1\0\2\4\1\0\1\272\10\0\6\4\1\135"+
    "\3\4\1\226\14\4\1\0\2\4\1\0\1\46\10\0"+
    "\5\4\1\46\3\4\1\46\15\4\1\0\2\4\1\0"+
    "\1\273\10\0\5\4\1\254\3\4\1\135\15\4\1\0"+
    "\2\4\1\0\1\254\10\0\5\4\1\254\21\4\1\0"+
    "\2\4\1\0\1\274\10\0\1\275\2\4\1\173\1\276"+
    "\1\277\3\4\1\300\1\145\1\4\1\301\3\4\1\302"+
    "\1\303\1\304\4\4\1\0\2\4\1\0\1\305\10\0"+
    "\11\4\1\46\7\4\1\303\5\4\1\0\2\4\1\0"+
    "\1\306\10\0\4\4\1\306\22\4\1\0\2\4\1\0"+
    "\1\307\10\0\14\4\1\307\12\4\1\0\2\4\1\0"+
    "\1\265\10\0\3\4\1\173\10\4\1\46\12\4\1\0"+
    "\2\4\1\0\1\310\10\0\4\4\1\167\4\4\1\135"+
    "\1\145\14\4\1\0\2\4\1\0\1\311\10\0\1\312"+
    "\13\4\1\313\12\4\1\0\2\4\1\0\1\277\10\0"+
    "\5\4\1\277\21\4\1\0\2\4\1\0\1\314\10\0"+
    "\11\4\1\314\15\4\1\0\2\4\1\0\1\315\10\0"+
    "\1\316\21\4\1\304\4\4\1\0\2\4\1\0\1\302"+
    "\10\0\20\4\1\302\6\4\1\0\2\4\1\0\1\317"+
    "\10\0\14\4\1\320\3\4\1\302\6\4\1\0\2\4"+
    "\1\0\1\227\10\0\14\4\1\227\12\4\1\0\2\4"+
    "\1\0\1\321\10\0\14\4\1\321\12\4\1\0\2\4"+
    "\1\0\1\322\10\0\12\4\1\145\6\4\1\303\5\4"+
    "\1\0\2\4\1\0\1\303\10\0\21\4\1\303\5\4"+
    "\1\0\2\4\1\0\1\145\10\0\12\4\1\145\14\4"+
    "\1\0\2\4\1\0\1\323\10\0\4\4\1\167\4\4"+
    "\1\46\10\4\1\304\4\4\1\0\2\4\1\0\1\167"+
    "\10\0\4\4\1\167\22\4\1\0\2\4\1\0\1\304"+
    "\10\0\22\4\1\304\4\4\1\0\2\4\1\0\1\324"+
    "\10\0\1\316\13\4\1\111\12\4\1\0\2\4\1\0"+
    "\1\111\10\0\14\4\1\111\12\4\1\0\2\4\1\0"+
    "\1\316\10\0\1\316\26\4\1\0\2\4\1\0\1\312"+
    "\10\0\1\312\26\4\1\0\2\4\1\0\1\325\10\0"+
    "\3\4\1\173\1\4\1\277\21\4\1\0\2\4\1\0"+
    "\1\173\10\0\3\4\1\173\23\4\1\0\2\4\1\0"+
    "\1\326\10\0\3\4\1\173\5\4\1\135\2\4\1\321"+
    "\12\4\1\0\2\4\1\0\1\327\10\0\14\4\1\227"+
    "\3\4\1\302\6\4\1\0\2\4\1\0\1\330\10\0"+
    "\1\312\4\4\1\277\21\4\1\0\2\4\1\0\1\331"+
    "\10\0\4\4\1\167\4\4\1\314\15\4\1\0\2\4"+
    "\1\0\1\110\10\0\11\4\1\46\2\4\1\111\12\4"+
    "\1\0\2\4\1\0\1\332\10\0\11\4\1\46\10\4"+
    "\1\304\4\4\1\0\2\4\1\0\1\333\10\0\4\4"+
    "\1\306\15\4\1\304\4\4\1\0\2\4\1\0\1\334"+
    "\10\0\1\312\17\4\1\302\6\4\1\0\2\4\1\0"+
    "\1\335\10\0\12\4\1\145\1\4\1\111\4\4\1\303"+
    "\5\4\1\0\2\4\1\0\1\313\10\0\11\4\1\46"+
    "\2\4\1\321\12\4\1\0\2\4\1\0\1\336\10\0"+
    "\5\4\1\277\6\4\1\46\12\4\1\0\2\4\1\0"+
    "\1\320\10\0\14\4\1\320\12\4\1\0\2\4\1\0"+
    "\1\337\10\0\1\340\1\46\3\4\1\341\3\4\1\342"+
    "\1\46\1\4\1\343\1\46\2\4\1\167\2\46\4\4"+
    "\1\0\2\4\1\0\1\46\10\0\12\4\1\46\2\4"+
    "\1\46\11\4\1\0\2\4\1\0\1\344\10\0\5\4"+
    "\1\345\13\4\1\46\5\4\1\0\2\4\1\0\1\346"+
    "\10\0\1\346\26\4\1\0\2\4\1\0\1\347\10\0"+
    "\1\350\13\4\1\46\12\4\1\0\2\4\1\0\1\351"+
    "\10\0\1\4\1\46\7\4\1\314\6\4\1\167\6\4"+
    "\1\0\2\4\1\0\1\135\10\0\5\4\1\135\21\4"+
    "\1\0\2\4\1\0\1\46\10\0\22\4\1\46\4\4"+
    "\1\0\2\4\1\0\1\22\10\0\14\4\1\22\12\4"+
    "\1\0\2\4\1\0\1\345\10\0\5\4\1\345\21\4"+
    "\1\0\2\4\1\0\1\352\10\0\1\4\1\46\7\4"+
    "\1\314\15\4\1\0\2\4\1\0\1\46\10\0\5\4"+
    "\1\46\6\4\1\46\4\4\1\46\5\4\1\0\2\4"+
    "\1\0\1\353\10\0\12\4\1\46\5\4\1\167\6\4"+
    "\1\0\2\4\1\0\1\46\10\0\12\4\1\46\14\4"+
    "\1\0\2\4\1\0\1\167\10\0\20\4\1\167\6\4"+
    "\1\0\2\4\1\0\1\350\10\0\1\350\26\4\1\0"+
    "\2\4\1\0\1\343\10\0\14\4\1\22\1\46\11\4"+
    "\1\0\2\4\1\0\1\46\10\0\15\4\1\46\11\4"+
    "\1\0\2\4\1\0\1\342\10\0\5\4\1\135\3\4"+
    "\1\314\15\4\1\0\2\4\1\0\1\46\10\0\5\4"+
    "\1\46\14\4\1\46\4\4\1\0\2\4\1\0\1\343"+
    "\10\0\14\4\1\22\4\4\1\46\5\4\1\0\2\4"+
    "\1\0\1\46\10\0\1\4\1\46\13\4\1\46\11\4"+
    "\1\0\2\4\1\0\1\354\10\0\1\346\10\4\1\135"+
    "\15\4\1\0\2\4\1\0\1\355\10\0\11\4\1\135"+
    "\2\4\1\46\3\4\1\167\6\4\1\0\2\4\1\0"+
    "\1\356\10\0\1\346\11\4\1\46\14\4\1\0\2\4"+
    "\1\0\1\347\10\0\1\350\20\4\1\46\5\4\1\0"+
    "\2\4\1\0\1\357\10\0\5\4\1\345\6\4\1\22"+
    "\12\4\1\0\2\4\1\0\1\146\10\0\5\4\1\135"+
    "\4\4\1\46\14\4\1\0\2\4\1\0\1\46\10\0"+
    "\1\4\1\46\3\4\1\46\14\4\1\46\4\4\1\0"+
    "\2\4\1\0\1\360\10\0\1\350\2\4\1\167\1\46"+
    "\1\4\1\46\5\4\1\46\4\4\1\146\5\4\1\0"+
    "\2\4\1\0\1\204\10\0\3\4\1\167\15\4\1\135"+
    "\5\4\1\0\2\4\1\0\1\46\10\0\6\4\1\46"+
    "\5\4\1\46\12\4\1\0\2\4\1\0\1\46\10\0"+
    "\6\4\1\46\20\4\1\0\2\4\1\0\1\167\10\0"+
    "\3\4\1\167\23\4\1\0\2\4\1\0\1\135\10\0"+
    "\21\4\1\135\5\4\1\0\2\4\1\0\1\353\10\0"+
    "\3\4\1\167\10\4\1\46\12\4\1\0\2\4\1\0"+
    "\1\46\10\0\4\4\1\46\1\4\1\46\20\4\1\0"+
    "\2\4\1\0\1\146\10\0\14\4\1\46\4\4\1\146"+
    "\5\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7416];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\1\1\1\11\4\1\1\11"+
    "\1\1\1\11\40\1\1\0\301\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[240];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexema;
    int esEnter = 0;
    public int getLine(){return (yyline + 1);}
    public int getColumn(){return (yycolumn +1);}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Analizador_Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Analizador_Lexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 166) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { esEnter =0;return numero;
          }
        case 13: break;
        case 11: 
          { esEnter =0;return comentario;
          }
        case 14: break;
        case 10: 
          { esEnter =0;
                                        if(yytext().equalsIgnoreCase("if")){return if_;}
                                        if(yytext().equalsIgnoreCase("imports")){return imports;}
                                        if(yytext().equalsIgnoreCase("public")){return public_;}
                                        if(yytext().equalsIgnoreCase("module")){return module;}
                                        if(yytext().equalsIgnoreCase("sub")){return sub;}
                                        if(yytext().equalsIgnoreCase("for")){return for_;}
                                        if(yytext().equalsIgnoreCase("dim")){return dim;}
                                        if(yytext().equalsIgnoreCase("end")){return end_;}
                                        if(yytext().equalsIgnoreCase("integer")){return integer_;}
                                        if(yytext().equalsIgnoreCase("boolean")){return boolean_;}
                                        if(yytext().equalsIgnoreCase("string")){return string_;}
                                        if(yytext().equalsIgnoreCase("system")){return system_;}
                                        if(yytext().equalsIgnoreCase("console")){return console_;}
                                        if(yytext().equalsIgnoreCase("writeline")){return writeline;}
                                        if(yytext().equalsIgnoreCase("as")){return as;}
                                        if(yytext().equalsIgnoreCase("do")){return do_;}
                                        if(yytext().equalsIgnoreCase("while")){return while_;}
                                        if(yytext().equalsIgnoreCase("struct")){return struct;}
                                        if(yytext().equalsIgnoreCase("then")){return then;}
                                        if(yytext().equalsIgnoreCase("else")){return else_;}
                                        if(yytext().equalsIgnoreCase("function")){return function_;}
                                        if(yytext().equalsIgnoreCase("return")){return return_;}
                                        if(yytext().equalsIgnoreCase("next")){return next;}
                                        if(yytext().equalsIgnoreCase("private")){return private_;}
                                        if(yytext().equalsIgnoreCase("loop")){return loop;}
                                        if(yytext().equalsIgnoreCase("exit")){return exit;}
                                        if(yytext().equalsIgnoreCase("until")){return until;}
                                        if(yytext().equalsIgnoreCase("to")){return to;}
                                        if(yytext().equalsIgnoreCase("and")){return and;}
                                        if(yytext().equalsIgnoreCase("or")){return or;}
                                        if(yytext().equalsIgnoreCase("true")){return true_;}
                                        if(yytext().equalsIgnoreCase("false")){return false_;}
                                        if(yytext().equalsIgnoreCase("like")){return like;}
                                        if(yytext().equalsIgnoreCase("mod")){return mod;}
                                        if(yytext().equalsIgnoreCase("int")){return  int_;}
                                        if(yytext().equalsIgnoreCase("null")){return null_;}
                                        if(yytext().equalsIgnoreCase("main")){return main_;}
                                        if(yytext().equalsIgnoreCase("step")){return step_;}
                                        if(yytext().equalsIgnoreCase("byval")){return byval;}    
                                        if(yytext().equalsIgnoreCase("elseif")){return elseif_;}    
                                        if(yytext().equalsIgnoreCase("readline")){return readline;}
          }
        case 15: break;
        case 12: 
          { esEnter =0;return texto_;
          }
        case 16: break;
        case 7: 
          { esEnter =0;
                                        if(yytext().equals(".")){return punto;}
                                        if(yytext().equals("\"")){return comillaD;}
                                        if(yytext().equals("\'")){return comillaS;}
                                        if(yytext().equals("(")){return parentesisA;}
                                        if(yytext().equals(")")){return parentesisC;}
                                        if(yytext().equals("{")){return llaveA;}
                                        if(yytext().equals("}")){return llaveC;}
                                        if(yytext().equals(",")){return coma;}
          }
        case 17: break;
        case 3: 
          { esEnter =0;return identificador;
          }
        case 18: break;
        case 4: 
          { esEnter =0;
                                        if(yytext().equals(">=")){return mayorigual;}
                                        if(yytext().equals("<=")){return menorigual;}
                                        if(yytext().equals("=")){return igual;}
                                        if(yytext().equals(">")){return mayor;}
                                        if(yytext().equals("<")){return menor;}
          }
        case 19: break;
        case 5: 
          { esEnter =0;
                                        if(yytext().equals("+")){return suma;}
                                        if(yytext().equals("-")){return resta_;}
                                        if(yytext().equals("*")){return mult;}
                                        if(yytext().equals("/")){return div;}
                                        if(yytext().equals("^")){return potencia;}
                                        if(yytext().equals("%")){return mod_;}
          }
        case 20: break;
        case 8: 
          { esEnter++; if(esEnter==1){return findelinea;}
          }
        case 21: break;
        case 6: 
          { /*Ignore*/
          }
        case 22: break;
        case 1: 
          { esEnter =0;
                                        return error_;
          }
        case 23: break;
        case 9: 
          { esEnter =0;return continuaciondelinea;
          }
        case 24: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
