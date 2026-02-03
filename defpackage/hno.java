package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hno extends hpt {
    private final hnp a;

    public hno(fdap fdapVar) {
        super(new fdae() { // from class: hnn
            @Override // defpackage.fdae
            public final Object invoke() {
                hmz.h("Unexpected call to default provider");
                throw new fcta();
            }
        });
        this.a = new hnp(fdapVar);
    }

    @Override // defpackage.hng
    public final /* synthetic */ hsl a() {
        return this.a;
    }

    @Override // defpackage.hpt
    public final hpu c(Object obj) {
        return new hpu(this, obj, obj == null, null, true);
    }
}
