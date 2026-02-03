package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aywc implements dqoe {
    public static final aywc a = new aywc();
    public static final Map b = fcwa.h(new fcti(c("_id"), d("_id")), new fcti(c("conversation_id"), d("conversation_id")), new fcti(c("pin_status"), d("pin_status")));

    private aywc() {
    }

    private static final ayvl c(String str) {
        dqpo[] dqpoVarArrC = ayvw.c();
        for (int i = 0; i < 3; i++) {
            dqpo dqpoVar = dqpoVarArrC[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (ayvl) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final bocy d(String str) {
        dqpo[] dqpoVarArrB = bodi.b();
        for (int i = 0; i < 3; i++) {
            dqpo dqpoVar = dqpoVarArrB[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (bocy) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dqoe
    public final void a() {
        String[] strArr = aywb.a;
        ayvs ayvsVar = new ayvs();
        ayvsVar.f("clearBackupTable");
        ayvsVar.e();
        ayvsVar.b().b();
    }

    @Override // defpackage.dqoe
    public final void b() {
        String[] strArr = aywb.a;
        dqtq dqtqVar = new dqtq("conversation_pins_backup", "backup");
        dqtqVar.d = 5;
        Map map = b;
        ayvl[] ayvlVarArr = (ayvl[]) map.keySet().toArray(new ayvl[0]);
        dqtqVar.b((dqpo[]) Arrays.copyOf(ayvlVarArr, ayvlVarArr.length));
        String[] strArr2 = bodn.a;
        bodk bodkVar = new bodk(bodn.a);
        bodkVar.s();
        bocy[] bocyVarArr = (bocy[]) map.values().toArray(new bocy[0]);
        bodkVar.c((bocy[]) Arrays.copyOf(bocyVarArr, bocyVarArr.length));
        dqtqVar.c = bodkVar.b();
        dqtqVar.a().a();
    }
}
