package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tji extends tjk {
    private final int a;

    public tji(int i) {
        this.a = i;
    }

    @Override // defpackage.tlo
    public final int a() {
        return 1;
    }

    @Override // defpackage.tjk, defpackage.tlo
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tlo) {
            tlo tloVar = (tlo) obj;
            if (tloVar.a() == 1 && this.a == tloVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a.a(Integer.toString(this.a - 1), "DialogLoggingSource{blockAndReportSpamDialogSource=", "}");
    }
}
