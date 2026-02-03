package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byyp {
    private static final cqce a = cqce.g("BugleCms", "CmsRestoreMsisdnResolver");
    private final cmfe b;
    private final alrj c;

    public byyp(cmfe cmfeVar, alrj alrjVar) {
        cmfeVar.getClass();
        alrjVar.getClass();
        this.b = cmfeVar;
        this.c = alrjVar;
    }

    private final String b() throws IOException {
        String strP;
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("getMsisdnFromParticipants");
        bsboVarE.h(new Function() { // from class: byyo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.getClass();
                bsbxVar.v(-1);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqqj dqqjVarP = bsboVarE.b().p();
        try {
            brzj brzjVar = (brzj) dqqjVarP;
            String strO = (!brzjVar.moveToFirst() || (strP = brzjVar.p()) == null) ? null : ((alqk) this.c.u(strP, -1)).o();
            fczl.a(dqqjVarP, null);
            return strO;
        } finally {
        }
    }

    public final String a(bojh bojhVar, String str) {
        String msisdn;
        bojhVar.getClass();
        if (cpyl.a() && ((Boolean) ((cczi) cpxw.e.get()).e()).booleanValue() && !TextUtils.isEmpty(bojhVar.af())) {
            return bojhVar.af();
        }
        cmfe cmfeVar = this.b;
        if (!cmfeVar.h().isConnected()) {
            return b();
        }
        try {
            msisdn = cmfeVar.h().getMsisdn();
        } catch (efao e) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.A("Conversation cms id", str);
            cqbdVarE.I("Can not get msisdn from RCS service");
            cqbdVarE.s(e);
            msisdn = null;
        }
        if (msisdn != null) {
            return msisdn;
        }
        a.r("Failed to get Rcs Msisdn from RcsProfileService");
        return b();
    }
}
