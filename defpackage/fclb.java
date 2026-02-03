package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fclb extends fckz {
    @Override // defpackage.fckz
    public final boolean a(fclc fclcVar) {
        synchronized (fclcVar) {
            if (fclcVar.a != 0) {
                return false;
            }
            fclcVar.a = -1;
            return true;
        }
    }

    @Override // defpackage.fckz
    public final void b(fclc fclcVar) {
        synchronized (fclcVar) {
            fclcVar.a = 0;
        }
    }
}
