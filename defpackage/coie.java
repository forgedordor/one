package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coie {
    public static final ekrz a = new ekrz("transfer_id", String.class, false, false);
    public static final ekrz b = new ekrz("transfer_handle", String.class, false, false);
    public static final ekrz c = new ekrz("num_redirects", Integer.class, false, false);
    public static final ekrz d = new ekrz("http_status_code", Integer.class, false, false);
    public static final ekrz e = new ekrz("bytes_uploaded", Long.class, false, false);
    public static final ekrz f = new ekrz("total_bytes", Long.class, false, false);
    public static final ekrz g = new ekrz("file_transfer_Event", FileTransferEvent.class, false, false);
    public static final ekrz h;
    public static final ekrz i;
    public static final ekrz j;

    static {
        new ekrz("content_type", String.class, false, false);
        h = new ekrz("file_transfer_result", FileTransferResult.class, false, false);
        i = new ekrz("in_progress_file_transfer_state", String.class, false, false);
        j = new ekrz("file_processing_id", athh.class, false, false);
    }
}
