package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvka implements cqvf {
    final /* synthetic */ AudioButtonView a;

    public cvka(AudioButtonView audioButtonView) {
        this.a = audioButtonView;
    }

    @Override // defpackage.cqvf
    public final void a() {
        AudioButtonView audioButtonView = this.a;
        if (audioButtonView.w == 2) {
            aomc aomcVar = audioButtonView.i;
            int i = audioButtonView.e;
            synchronized (aomc.class) {
                if (aomcVar.d != null) {
                    throw new IllegalStateException("Trying to start a new recording session while already recording!");
                }
                cczv cczvVar = aonl.a;
                String str = ((Boolean) cczvVar.e()).booleanValue() ? "m4a" : "amr";
                Context context = aomcVar.b;
                Uri uriD = bxlf.d(str, context);
                MediaRecorder mediaRecorder = new MediaRecorder();
                if (uriD != null) {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uriD, "wt");
                        if (parcelFileDescriptorOpenFileDescriptor == null) {
                            ekrw ekrwVarI = aomc.a.i();
                            ekrwVarI.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startRecording", 147, "LevelTrackingMediaRecorder.java")).q("Unable to open the scratch file URI.");
                        } else {
                            mediaRecorder.setAudioSource(1);
                            int iA = aomcVar.a(i);
                            if (iA != 0) {
                                mediaRecorder.setMaxDuration((int) TimeUnit.SECONDS.toMillis(iA));
                                if (((Boolean) cczvVar.e()).booleanValue()) {
                                    mediaRecorder.setOutputFormat(2);
                                    mediaRecorder.setAudioEncoder(3);
                                    mediaRecorder.setAudioSamplingRate(((Integer) aonl.d.e()).intValue());
                                    mediaRecorder.setAudioEncodingBitRate(((Integer) aonl.e.e()).intValue());
                                } else {
                                    mediaRecorder.setOutputFormat(3);
                                    mediaRecorder.setAudioEncoder(1);
                                }
                                mediaRecorder.setMaxFileSize((int) (i * 0.8f));
                                mediaRecorder.setOutputFile(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                                mediaRecorder.setOnErrorListener(audioButtonView);
                                mediaRecorder.setOnInfoListener(audioButtonView);
                                mediaRecorder.prepare();
                                mediaRecorder.start();
                                aomcVar.d();
                                long jIntValue = ((Integer) aonl.i.e()).intValue();
                                if (jIntValue <= 0) {
                                    ekrw ekrwVarE = aomc.a.e();
                                    ekrwVarE.X(eksq.a, "Bugle");
                                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startTrackingSoundLevel", 340, "LevelTrackingMediaRecorder.java")).q("Audio level polling is disabled by override.");
                                } else {
                                    aomcVar.g = aomcVar.c(0L, jIntValue);
                                }
                                aomcVar.d = mediaRecorder;
                                aomcVar.e = uriD;
                                aomcVar.f = parcelFileDescriptorOpenFileDescriptor;
                                audioButtonView.a = audioButtonView.f.f().toEpochMilli();
                                audioButtonView.g(3);
                                audioButtonView.d = audioButtonView.m.schedule(new eopa(null), audioButtonView.i.a(audioButtonView.e) - audioButtonView.getResources().getInteger(R.integer.audio_timer_warning_duration_seconds), TimeUnit.SECONDS);
                                eika.l(audioButtonView.d, new cvjz(this), audioButtonView.k);
                                return;
                            }
                            ekrw ekrwVarI2 = aomc.a.i();
                            ekrwVarI2.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ekrwVarI2).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startRecording", 155, "LevelTrackingMediaRecorder.java")).q("Something went wrong when starting media recorder.");
                        }
                    } catch (Exception e) {
                        ekrw ekrwVarJ = aomc.a.j();
                        ekrwVarJ.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startRecording", 182, "LevelTrackingMediaRecorder.java")).t("Something went wrong when starting media recorder. %s", e);
                    }
                }
                audioButtonView.r.i(R.string.audio_recording_start_failed);
            }
        }
    }
}
