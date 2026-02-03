package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcgc extends UnsupportedOperationException {
    private final Feature a;

    public dcgc(Feature feature) {
        this.a = feature;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.a)));
    }
}
