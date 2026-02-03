package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvjy extends GestureDetector {
    final /* synthetic */ AudioButtonView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvjy(AudioButtonView audioButtonView, Context context, GestureDetector.OnGestureListener onGestureListener) {
        super(context, onGestureListener);
        this.a = audioButtonView;
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        eieh eiehVarC;
        int action = motionEvent.getAction();
        if (action == 0) {
            AudioButtonView audioButtonView = this.a;
            eieh eiehVarC2 = ((eigp) audioButtonView.v.b()).c("AudioButtonView ACTION_DOWN", "com/google/android/apps/messaging/ui/conversation/AudioButtonView$1", "onTouchEvent", 229);
            try {
                if (((crma) audioButtonView.n.b()).n()) {
                    int mode = ((AudioManager) audioButtonView.u.b()).getMode();
                    if (mode == 2 || mode == 3) {
                        cqca.i("Bugle", "Cannot record while call is in progress.");
                        audioButtonView.r.i(R.string.audio_recorder_call_in_progress);
                    } else {
                        audioButtonView.c = false;
                        if (audioButtonView.w == 1) {
                            audioButtonView.g(2);
                            audioButtonView.b(R.raw.audio_initiate, new cvka(audioButtonView));
                        }
                    }
                } else {
                    cqca.i("Bugle", "Record audio permission not granted yet.");
                    ((crmg) audioButtonView.o.b()).i(new cvkb(audioButtonView));
                }
                eiehVarC2.close();
            } finally {
                try {
                    eiehVarC2.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } else if (action == 1) {
            AudioButtonView audioButtonView2 = this.a;
            eiehVarC = ((eigp) audioButtonView2.v.b()).c("AudioButtonView ACTION_UP", "com/google/android/apps/messaging/ui/conversation/AudioButtonView$1", "onTouchEvent", 240);
            try {
                if (audioButtonView2.w == 2) {
                    audioButtonView2.c();
                }
                audioButtonView2.d(false);
                eiehVarC.close();
            } finally {
            }
        } else if (action == 2) {
            AudioButtonView audioButtonView3 = this.a;
            cvnx cvnxVar = audioButtonView3.y;
            if (cvnxVar != null && audioButtonView3.f()) {
                float rawX = motionEvent.getRawX();
                motionEvent.getRawY();
                cvnz cvnzVar = cvnxVar.a;
                cvnzVar.a.getLocationOnScreen(cvnzVar.f);
                if (!cvnzVar.h.e() ? rawX < r2[0] + (r1.getWidth() * cvnzVar.g) : rawX > r2[0] + (r1.getWidth() * (1.0f - cvnzVar.g))) {
                    eiehVarC = ((eigp) cvnzVar.i.b()).c("VoiceMessagesUiController#onTouchMove", "com/google/android/apps/messaging/ui/conversation/VoiceMessagesUiController$1", "onTouchMove", 90);
                    try {
                        cvnzVar.b.a();
                        eiehVarC.close();
                    } finally {
                    }
                }
            }
        } else if (action == 3) {
            this.a.a();
            return true;
        }
        return true;
    }
}
