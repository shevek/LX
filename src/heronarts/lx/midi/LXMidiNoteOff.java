/**
 * ##library.name##
 * ##library.sentence##
 * ##library.url##
 *
 * Copyright ##copyright## ##author##
 * All Rights Reserved
 *
 * @author      ##author##
 * @modified    ##date##
 * @version     ##library.prettyVersion## (##library.version##)
 */

package heronarts.lx.midi;

import javax.sound.midi.ShortMessage;

public class LXMidiNoteOff extends LXMidiNote {

  LXMidiNoteOff(ShortMessage message) {
    super(message, ShortMessage.NOTE_OFF);
  }

}
