package game2048;

/**
 * @Author JinlinQueenieDuan
 * @Date 04/22/2024
 * Describes a source of input commands.
 */
interface InputSource {

    /** Returns one command string. */
    String getKey();

    /** Returns a candidate Tile whose row and column is in the range
     *  0 .. SIZE-1.  */
    Tile getNewTile(int size);

}
