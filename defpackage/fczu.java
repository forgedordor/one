package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fczu implements fdev {
    public final BufferedReader a;

    public fczu(BufferedReader bufferedReader) {
        this.a = bufferedReader;
    }

    @Override // defpackage.fdev
    public final Iterator a() {
        return new fczt(this);
    }
}
