package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnz extends hpt {
    private final hrn a;

    public hnz(hrn hrnVar, fdae fdaeVar) {
        super(fdaeVar);
        this.a = hrnVar;
    }

    @Override // defpackage.hpt
    public final hpu c(Object obj) {
        return new hpu(this, obj, obj == null, this.a, true);
    }
}
