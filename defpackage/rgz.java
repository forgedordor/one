package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rgz extends rha {
    @Override // defpackage.rha
    public final boolean a() {
        return true;
    }

    @Override // defpackage.rha
    public final boolean b() {
        return true;
    }

    @Override // defpackage.rha
    public final boolean c(reb rebVar) {
        return rebVar == reb.REMOTE;
    }

    @Override // defpackage.rha
    public final boolean d(boolean z, reb rebVar, int i) {
        return ((z && rebVar == reb.DATA_DISK_CACHE) || rebVar == reb.LOCAL) && i == 2;
    }
}
