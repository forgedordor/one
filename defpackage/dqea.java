package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqea extends fcyz implements fdap {
    int a;
    final /* synthetic */ dqee b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqea(dqee dqeeVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dqeeVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dqee dqeeVar = this.b;
            fduf fdufVar = dqeeVar.m;
            if (!(fdufVar.c() instanceof dqdn)) {
                ((ekrd) dqee.a.j().h("com/google/android/libraries/compose/voice/recorder/VoiceRecordingManager$stopRecording$2", "invokeSuspend", 141, "VoiceRecordingManager.kt")).t("Cannot stop recording while in state '%s'", fdufVar.c());
                return fctx.a;
            }
            this.a = 1;
            obj = dqeeVar.h(false, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Uri uri = (Uri) obj;
        if (uri == null) {
            this.b.m.f(dqdm.a);
            ((ekrd) dqee.a.j().h("com/google/android/libraries/compose/voice/recorder/VoiceRecordingManager$stopRecording$2", "invokeSuspend", 149, "VoiceRecordingManager.kt")).q("No output file produced");
        } else {
            dqee dqeeVar2 = this.b;
            dqeeVar2.m.f(new dqdo(dqeeVar2.a(uri)));
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqea(this.b, (fcxy) obj).b(fctx.a);
    }
}
