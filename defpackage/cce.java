package defpackage;

import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecordingConfiguration;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cce extends AudioManager$AudioRecordingCallback {
    final /* synthetic */ ccf a;

    public cce(ccf ccfVar) {
        this.a = ccfVar;
    }

    public final void onRecordingConfigChanged(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfigurationM163m = aky$$ExternalSyntheticApiModelOutline0.m163m(it.next());
            int clientAudioSessionId = audioRecordingConfigurationM163m.getClientAudioSessionId();
            ccf ccfVar = this.a;
            if (clientAudioSessionId == ccfVar.a.getAudioSessionId()) {
                ccfVar.f(audioRecordingConfigurationM163m.isClientSilenced());
                return;
            }
        }
    }
}
