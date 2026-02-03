package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctak {
    public static final ekgp a;
    public final fcsu b;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("/bugle/rpc/update_data/", 1);
        ekgiVar.i("/bugle/rpc/call_contact/", 2);
        ekgiVar.i("/bugle/rpc/send_message/", 3);
        ekgiVar.i("/bugle/rpc/create_conversation/", 4);
        ekgiVar.i("/bugle/rpc/mark_as_read/", 5);
        ekgiVar.i("/bugle/rpc/open_conversation/", 6);
        ekgiVar.i("/bugle/rpc/resend_message/", 7);
        ekgiVar.i("/bugle/rpc/delete_message/", 8);
        ekgiVar.i("/bugle/rpc/download_message/", 9);
        ekgiVar.i("/bugle/rpc/delete_conversation/", 10);
        ekgiVar.i("/bugle/rpc/request_more_messages/", 11);
        ekgiVar.i("/bugle/rpc/more_messages/", 12);
        a = ekgiVar.c();
    }

    public ctak(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    @Deprecated
    public final void a(String str) {
        ((ains) this.b.b()).e("Bugle.Wear.Rpc.Incoming.Count", ((Integer) a.getOrDefault(str, 0)).intValue());
    }
}
