package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpma extends RuntimeException {
    public cpma() {
        super("Response does not contain a status for each requested participant");
        Optional.empty();
    }

    public cpma(String str, String str2) {
        super(str2);
        Optional.of(str);
    }
}
