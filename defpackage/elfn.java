package defpackage;

import j$.time.Duration;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elfn extends elfq {
    private final elfq a;
    private final elfq b;
    private final int c;

    public elfn(elfq elfqVar, elfq elfqVar2) {
        this.a = elfqVar;
        this.b = elfqVar2;
        this.c = ((elfo) elfqVar).a;
    }

    @Override // defpackage.elfq
    public final Duration a(int i) {
        int i2 = this.c;
        return i < i2 ? this.a.a(i) : this.b.a((i + 1) - i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof elfn) {
            elfn elfnVar = (elfn) obj;
            if (this.a.equals(elfnVar.a) && this.b.equals(elfnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
