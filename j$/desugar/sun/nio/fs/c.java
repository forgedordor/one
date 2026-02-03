package j$.desugar.sun.nio.fs;

import j$.nio.file.attribute.w;

/* loaded from: classes9.dex */
public final class c implements j$.nio.file.attribute.h {
    public final w a;
    public final w b;
    public final w c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final Integer i;

    public c(w wVar, w wVar2, w wVar3, boolean z, boolean z2, boolean z3, boolean z4, long j, Integer num) {
        this.a = wVar;
        this.b = wVar2;
        this.c = wVar3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = num;
    }

    @Override // j$.nio.file.attribute.h
    public final w creationTime() {
        return this.c;
    }

    @Override // j$.nio.file.attribute.h
    public final Object fileKey() {
        return this.i;
    }

    @Override // j$.nio.file.attribute.h
    public final boolean isDirectory() {
        return this.e;
    }

    @Override // j$.nio.file.attribute.h
    public final boolean isOther() {
        return this.g;
    }

    @Override // j$.nio.file.attribute.h
    public final boolean isRegularFile() {
        return this.d;
    }

    @Override // j$.nio.file.attribute.h
    public final boolean isSymbolicLink() {
        return this.f;
    }

    @Override // j$.nio.file.attribute.h
    public final w lastAccessTime() {
        return this.b;
    }

    @Override // j$.nio.file.attribute.h
    public final w lastModifiedTime() {
        return this.a;
    }

    @Override // j$.nio.file.attribute.h
    public final long size() {
        return this.h;
    }
}
