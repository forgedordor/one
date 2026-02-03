package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ebli extends eblf {
    public static final eblf f;

    static {
        String str;
        String str2;
        ebmr ebmrVar;
        ebln eblnVar;
        dhip dhipVar;
        ekgb ekgbVar;
        ebkr ebkrVar;
        ebku ebkuVar = new ebku();
        ebkuVar.a = "user";
        ebkuVar.b = "domain";
        ebkuVar.c = "stub";
        ebkuVar.e = new eblc();
        ebmr ebmrVar2 = ebmr.TCP;
        if (ebmrVar2 == null) {
            throw new NullPointerException("Null transportProtocol");
        }
        ebkuVar.d = ebmrVar2;
        ebkuVar.f = new dhip("test");
        int i = ekgb.d;
        ebkuVar.g = ekgb.n(ekoe.a);
        ebkuVar.h = new ebkr();
        String str3 = ebkuVar.a;
        if (str3 != null && (str = ebkuVar.b) != null && (str2 = ebkuVar.c) != null && (ebmrVar = ebkuVar.d) != null && (eblnVar = ebkuVar.e) != null && (dhipVar = ebkuVar.f) != null && (ekgbVar = ebkuVar.g) != null && (ebkrVar = ebkuVar.h) != null) {
            f = new ebkv(str3, str, str2, ebmrVar, eblnVar, dhipVar, ekgbVar, ebkrVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (ebkuVar.a == null) {
            sb.append(" user");
        }
        if (ebkuVar.b == null) {
            sb.append(" domain");
        }
        if (ebkuVar.c == null) {
            sb.append(" sipInstance");
        }
        if (ebkuVar.d == null) {
            sb.append(" transportProtocol");
        }
        if (ebkuVar.e == null) {
            sb.append(" sipTransactionLayer");
        }
        if (ebkuVar.f == null) {
            sb.append(" logTag");
        }
        if (ebkuVar.g == null) {
            sb.append(" messageFilters");
        }
        if (ebkuVar.h == null) {
            sb.append(" addressFactory");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static eblh x() {
        ebks ebksVar = new ebks();
        int i = ekgb.d;
        ebksVar.b(ekoe.a);
        ebksVar.d = new ebkr();
        return ebksVar;
    }
}
