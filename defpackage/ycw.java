package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ycw extends fdbo implements fdat {
    public ycw(Object obj) {
        super(2, obj, ych.class, "invalidate", "invalidate(ILcom/google/android/apps/messaging/conversation2/messagelist/message/BugleMessageUiData;)V", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        yis yisVar = (yis) obj2;
        yisVar.getClass();
        ych ychVar = (ych) this.g;
        ychVar.a.remove(ych.a(yisVar.a()));
        ychVar.b.remove(Integer.valueOf(iIntValue));
        return fctx.a;
    }
}
