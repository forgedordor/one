package defpackage;

import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aftx extends fdbo implements fdae {
    public aftx(Object obj) {
        super(0, obj, aftz.class, "onClick", "onClick()V", 0);
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() throws IOException {
        aftz aftzVar = (aftz) this.g;
        eieh eiehVarA = aftzVar.d.a("MultiShare MirrorExtendedFabAdapterImpl#onClick");
        try {
            afmz afmzVar = aftzVar.f;
            int size = afmzVar.a().c().size();
            if (size == 1) {
                ((afxx) aftzVar.i.b()).b(1);
                ChipData chipData = (ChipData) afmzVar.a().c().get(0);
                ChipId chipId = chipData.a;
                if (chipId instanceof ChipId.Identity) {
                    alqm alqmVar = ((ChipId.Identity) chipId).a;
                    String str = chipData.b;
                    auvw.k(aftzVar.a, aftzVar.b, null, new aftw(aftzVar, alqmVar, null), 2);
                } else {
                    if (!(chipId instanceof ChipId.Conversation)) {
                        throw new fctg();
                    }
                    aftzVar.b(((ChipId.Conversation) chipId).a);
                }
            } else {
                ((afxx) aftzVar.i.b()).b(size);
                aftzVar.h.b();
            }
            fczl.a(eiehVarA, null);
            return fctx.a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eiehVarA, th);
                throw th2;
            }
        }
    }
}
