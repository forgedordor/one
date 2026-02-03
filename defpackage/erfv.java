package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erfv implements erga {
    public final String a;
    public final erwn b;
    public final evqs c;
    public final ermy d;
    public final Integer e;
    public final int f;

    private erfv(String str, erwn erwnVar, evqs evqsVar, int i, ermy ermyVar, Integer num) {
        this.a = str;
        this.b = erwnVar;
        this.c = evqsVar;
        this.f = i;
        this.d = ermyVar;
        this.e = num;
    }

    public static erfv a(String str, evqs evqsVar, int i, ermy ermyVar, Integer num) throws GeneralSecurityException {
        if (ermyVar == ermy.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new erfv(str, ergh.a(str), evqsVar, i, ermyVar, num);
    }
}
