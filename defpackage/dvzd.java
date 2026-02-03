package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzd extends dvzh {
    private final dwam a;

    public dvzd(dwam dwamVar) {
        this.a = dwamVar;
    }

    @Override // defpackage.dwbc
    public final int b() {
        return 2;
    }

    @Override // defpackage.dvzh, defpackage.dwbc
    public final dwam c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwbc) {
            dwbc dwbcVar = (dwbc) obj;
            if (dwbcVar.b() == 2 && this.a.equals(dwbcVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1001100;
    }

    public final String toString() {
        return "OneOfType{blockUnblockUsers=BlockUnblockUsers{syncBlockStatus=true}}";
    }
}
