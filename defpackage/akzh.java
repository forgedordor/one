package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akzh extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new akzg(this);
    }

    public final void b(Iterable iterable) {
        int iIntValue = akzi.c().intValue();
        if (iIntValue < 10007) {
            dqru.x("conv_type", iIntValue);
        }
        ap(new dqpm("conversations.conv_type", 3, as(iterable), true));
    }

    public final void c(int i) {
        ap(new dqty("conversations.participant_count", 9, Integer.valueOf(i)));
    }
}
