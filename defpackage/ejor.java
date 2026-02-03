package defpackage;

import j$.time.Instant;
import j$.time.LocalDateTime;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejor {
    public static final ezgy a;
    public static final ezgy b;
    public static final Instant c;
    public final LocalDateTime d;
    public final LocalDateTime e;
    public final LocalDateTime f;
    public final Instant g;
    public final Instant h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    private final String l;
    private final String m;
    private final float n;

    static {
        ezgx ezgxVar = (ezgx) ezgy.a.createBuilder();
        eyba eybaVar = (eyba) eybc.a.createBuilder();
        eybaVar.copyOnWrite();
        ((eybc) eybaVar.instance).d = 1;
        eybaVar.copyOnWrite();
        ((eybc) eybaVar.instance).e = 1;
        eybaVar.copyOnWrite();
        ((eybc) eybaVar.instance).f = 1;
        eybaVar.copyOnWrite();
        ((eybc) eybaVar.instance).g = 0;
        eybaVar.copyOnWrite();
        ((eybc) eybaVar.instance).h = 0;
        eybc eybcVar = (eybc) eybaVar.build();
        ezgxVar.copyOnWrite();
        ezgy ezgyVar = (ezgy) ezgxVar.instance;
        eybcVar.getClass();
        ezgyVar.c = eybcVar;
        ezgyVar.b |= 1;
        eybe eybeVar = eybe.DAY_OF_WEEK_UNSPECIFIED;
        ezgxVar.copyOnWrite();
        ((ezgy) ezgxVar.instance).d = eybeVar.a();
        a = (ezgy) ezgxVar.build();
        ezgx ezgxVar2 = (ezgx) ezgy.a.createBuilder();
        eyba eybaVar2 = (eyba) eybc.a.createBuilder();
        eybaVar2.copyOnWrite();
        ((eybc) eybaVar2.instance).d = 9999;
        eybaVar2.copyOnWrite();
        ((eybc) eybaVar2.instance).e = 12;
        eybaVar2.copyOnWrite();
        ((eybc) eybaVar2.instance).f = 31;
        eybaVar2.copyOnWrite();
        ((eybc) eybaVar2.instance).g = 23;
        eybaVar2.copyOnWrite();
        ((eybc) eybaVar2.instance).h = 59;
        eybc eybcVar2 = (eybc) eybaVar2.build();
        ezgxVar2.copyOnWrite();
        ezgy ezgyVar2 = (ezgy) ezgxVar2.instance;
        eybcVar2.getClass();
        ezgyVar2.c = eybcVar2;
        ezgyVar2.b |= 1;
        eybe eybeVar2 = eybe.DAY_OF_WEEK_UNSPECIFIED;
        ezgxVar2.copyOnWrite();
        ((ezgy) ezgxVar2.instance).d = eybeVar2.a();
        b = (ezgy) ezgxVar2.build();
        c = Instant.ofEpochMilli(-1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ejor(defpackage.ejoq r5, j$.time.LocalDateTime r6) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejor.<init>(ejoq, j$.time.LocalDateTime):void");
    }

    public final ezgi a() {
        return b(this.h, null);
    }

    public final ezgi b(Instant instant, ezar ezarVar) {
        ezan ezanVar;
        ezgh ezghVar = (ezgh) ezgi.a.createBuilder();
        if (this.j) {
            ezcq ezcqVar = (ezcq) ezcr.a.createBuilder();
            String str = this.l;
            ezcqVar.copyOnWrite();
            ezcr ezcrVar = (ezcr) ezcqVar.instance;
            str.getClass();
            ezcrVar.b = str;
            ezcr ezcrVar2 = (ezcr) ezcqVar.build();
            ezghVar.copyOnWrite();
            ezgi ezgiVar = (ezgi) ezghVar.instance;
            ezcrVar2.getClass();
            ezgiVar.d = ezcrVar2;
            ezgiVar.c = 13;
            ezanVar = ezan.EMOTION;
        } else {
            if (!this.k) {
                return (ezgi) ezghVar.build();
            }
            ezgj ezgjVar = (ezgj) ezgk.a.createBuilder();
            String str2 = this.m;
            ezgjVar.copyOnWrite();
            ezgk ezgkVar = (ezgk) ezgjVar.instance;
            str2.getClass();
            ezgkVar.c = str2;
            ezghVar.copyOnWrite();
            ezgi ezgiVar2 = (ezgi) ezghVar.instance;
            ezgk ezgkVar2 = (ezgk) ezgjVar.build();
            ezgkVar2.getClass();
            ezgiVar2.d = ezgkVar2;
            ezgiVar2.c = 2;
            ezanVar = ezan.FULL_MESSAGE;
        }
        ezgf ezgfVar = (ezgf) ezgg.b.createBuilder();
        long epochMilli = instant.toEpochMilli();
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).p = epochMilli;
        ezai ezaiVar = ezai.RECEIVED;
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).d = ezaiVar.a();
        float f = this.n;
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).f = f;
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).l = ezanVar.a();
        ezal ezalVar = ezal.CONVERSATION_STARTER;
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).g = ezalVar.a();
        if (ezarVar != null) {
            ezgfVar.a(ezarVar);
        }
        ezghVar.copyOnWrite();
        ezgi ezgiVar3 = (ezgi) ezghVar.instance;
        ezgg ezggVar = (ezgg) ezgfVar.build();
        ezggVar.getClass();
        ezgiVar3.e = ezggVar;
        ezgiVar3.b |= 1;
        return (ezgi) ezghVar.build();
    }
}
