/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mapping;

import functional.Maybe;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaybeMapTest {

    @Test public void testSettingAnElementAndRetrievingItReturnsSameElement() {
        MaybeMap<Integer, Integer> maybeMap = MaybeMap.newMaybeMapWithAllKeysMappedToNothing();
        maybeMap.put((Integer)11, Maybe.asObject((Integer) 14));
        assertTrue(maybeMap.get((Integer)11).equals(Maybe.asObject((Integer) 14)));
    }
}