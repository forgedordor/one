package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyr {
    public final eibc a;
    public final ehwf b;
    public final efwo c;

    public ehyr(eibc eibcVar) {
        this.a = eibcVar;
        eiba eibaVar = eibcVar.c;
        this.b = new ehwf(eibaVar == null ? eiba.a : eibaVar);
        this.c = (eibcVar.b & 2) != 0 ? efwo.b(eibcVar.d) : null;
    }

    final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ehyr) {
            ehyr ehyrVar = (ehyr) obj;
            if (this.b.equals(ehyrVar.b)) {
                efwo efwoVar = this.c;
                efwo efwoVar2 = ehyrVar.c;
                if (efwoVar == null) {
                    if (efwoVar2 == null) {
                        return true;
                    }
                } else if (efwoVar.equals(efwoVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }
}
