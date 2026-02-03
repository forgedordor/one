package defpackage;

import com.google.android.apps.messaging.R;
import j$.time.Instant;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agis extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ agiu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agis(fcxy fcxyVar, agiu agiuVar) {
        super(3, fcxyVar);
        this.c = agiuVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        agis agisVar = new agis((fcxy) obj3, this.c);
        agisVar.d = (fdpm) obj;
        agisVar.b = (Object[]) obj2;
        return agisVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r2 = this.d;
            ajlk[] ajlkVarArr = (ajlk[]) this.b;
            agiu agiuVar = this.c;
            Instant instantF = agiuVar.e.f();
            ArrayList<cgrc> arrayList = new ArrayList(ajlkVarArr.length);
            boolean z = false;
            for (ajlk ajlkVar : ajlkVarArr) {
                cgrb cgrbVarK = ajlkVar.k();
                instantF.getClass();
                arrayList.add(cgrbVarK.a(instantF));
            }
            if (!arrayList.isEmpty()) {
                for (cgrc cgrcVar : arrayList) {
                    if (cgrcVar == cgrc.e || cgrcVar == cgrc.d) {
                        z = true;
                        break;
                    }
                }
            }
            String string = !z ? agiuVar.a.getString(R.string.action_snooze_alternative) : agiuVar.a.getString(R.string.action_unsnooze_alternative);
            string.getClass();
            dihq dihqVar = new dihq(string, djrr.dP, false, true, true, false, null, false, null, new agil(z, agiuVar), 996);
            this.a = 1;
            if (r2.fO(dihqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
