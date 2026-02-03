package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbto implements eqfv {
    private final arob a;

    public cbto(arob arobVar) {
        arobVar.getClass();
        this.a = arobVar;
    }

    @Override // defpackage.eqfv
    public final eqfu a(ezjj ezjjVar) {
        ezjjVar.getClass();
        if (this.a.a()) {
            String str = ezjjVar.c;
            str.getClass();
            int i = ezjjVar.d;
            ezji ezjiVarB = ezji.b(i);
            if (ezjiVarB == null) {
                ezjiVarB = ezji.UNRECOGNIZED;
            }
            if (ezjiVarB != ezji.GROUP) {
                ezji ezjiVarB2 = ezji.b(i);
                if (ezjiVarB2 == null) {
                    ezjiVarB2 = ezji.UNRECOGNIZED;
                }
                Objects.toString(ezjiVarB2);
                throw new IllegalArgumentException("Expected InboxMessage.MessageType.GROUP, but got ".concat(String.valueOf(ezjiVarB2)));
            }
            try {
                ezjd ezjdVar = (ezjd) evsn.parseFrom(ezjd.a, ezjjVar.e, evrr.a());
                ezjdVar.getClass();
                if ((ezjdVar.b & 1) != 0) {
                    eyya eyyaVar = ezjdVar.f;
                    if (eyyaVar == null) {
                        eyyaVar = eyya.a;
                    }
                    eyyaVar.getClass();
                    return new cbtm(str, eyyaVar);
                }
            } catch (evtj e) {
                throw new IllegalArgumentException("Failed to parse GroupMessage proto from InboxMessage's message field.", e);
            }
        }
        return new eqfu();
    }
}
