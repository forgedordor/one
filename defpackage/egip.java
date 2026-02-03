package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egip {
    public static final ehvh a = new ehve(1, 2);
    public final ehvf b;
    public final efwo c;
    public final eosc d;

    public egip(ehvf ehvfVar, efwo efwoVar, eosc eoscVar) {
        this.b = ehvfVar;
        this.c = efwoVar;
        this.d = eoscVar;
        ejwl.m(efwoVar.a() != -1, "Account Id is invalid");
    }

    static String b(efwo efwoVar) {
        return "accounts" + File.separator + efwoVar.a();
    }

    public final egih a(ehvh ehvhVar, String str) {
        return new egih(new ehvg(ehvhVar, this.b, b(this.c) + File.separator + str), this.d);
    }
}
