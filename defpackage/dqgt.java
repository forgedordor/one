package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqgt extends fcyz implements fdat {
    int a;
    final /* synthetic */ dqhd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqgt(dqhd dqhdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dqhdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqgt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnhb dnhbVarE = this.b.e();
            dngy dngyVar = dngy.g;
            this.a = 1;
            obj = dnhbVarE.e(dngyVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.b.bh();
        } else {
            ((ekrd) dqhd.a.h().h("com/google/android/libraries/compose/voice/ui/screen/VoiceScreen$requestAudioPermission$1", "invokeSuspend", 103, "VoiceScreen.kt")).q("Record audio permission not granted yet.");
            final dqhd dqhdVar = this.b;
            dqhd.bj(dqhdVar, R.string.record_audio_permission_description, R.string.open_settings, new View.OnClickListener() { // from class: dqgr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dqhd dqhdVar2 = dqhdVar;
                    fdil.d(dqhdVar2.bH(), null, null, new dqgs(dqhdVar2, null), 3);
                }
            });
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqgt(this.b, fcxyVar);
    }
}
