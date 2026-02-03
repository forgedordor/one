package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adty {
    public static final String[] a = {"conversations._id", "conversations.sort_timestamp", "conversation_pin.pin_status"};
    public static final ekgp b = new ekgi().c();
    public static final adtm c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("sort_timestamp", "index_null_sort_timestamp");
        ekgiVar.c();
        c = new adtm();
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static Integer b() {
        return Integer.valueOf(a().M().a());
    }
}
