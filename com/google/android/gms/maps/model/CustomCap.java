package com.google.android.gms.maps.model;

import defpackage.dclh;
import defpackage.ddrc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CustomCap extends Cap {
    public final ddrc c;
    public final float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCap(ddrc ddrcVar, float f) {
        super(3, ddrcVar, Float.valueOf(f));
        dclh.n(ddrcVar, "bitmapDescriptor must not be null");
        if (f <= 0.0f) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        this.c = ddrcVar;
        this.d = f;
    }

    @Override // com.google.android.gms.maps.model.Cap
    public final String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.c) + " refWidth=" + this.d + "]";
    }
}
