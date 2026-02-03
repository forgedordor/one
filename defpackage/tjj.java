package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjj extends tjk {
    @Override // defpackage.tlo
    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tlo)) {
            return false;
        }
        tlo tloVar = (tlo) obj;
        if (tloVar.a() != 2) {
            return false;
        }
        tloVar.c();
        return true;
    }

    public final int hashCode() {
        return 4;
    }

    public final String toString() {
        return a.a(Integer.toString(3), "DialogLoggingSource{rbmBlockAndReportSpamDialogSource=", "}");
    }

    @Override // defpackage.tjk, defpackage.tlo
    public final void c() {
    }
}
