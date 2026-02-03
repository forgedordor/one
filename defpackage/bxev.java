package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateMessagePartSizeAction;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxev extends bxhb {
    private final String a;
    private final Uri n;
    private final aykr o;

    /* compiled from: PG */
    public interface a {
        aykr iq();
    }

    public bxev(MessagePartCoreData messagePartCoreData) {
        this(messagePartCoreData.W(), messagePartCoreData.t(), messagePartCoreData.x(), 250, 250, messagePartCoreData.c(), messagePartCoreData.b(), true);
    }

    @Override // defpackage.bxhb
    public final Uri a() {
        return c() ? this.n : this.k;
    }

    @Override // defpackage.bxgf
    public final void b(int i, int i2) {
        String str = this.a;
        if (str == null || this.n != null || i == -1 || i2 == -1 || i == this.e || i2 == this.f) {
            return;
        }
        new UpdateMessagePartSizeAction(this.o.a, str, i, i2).z();
    }

    protected final boolean c() {
        return this.k == null && this.n != null;
    }

    protected bxev(String str, Uri uri, Uri uri2, int i, int i2, int i3, int i4, boolean z) {
        super(uri, i, i2, i3, i4, true, false, false, 0, z);
        this.a = str;
        this.n = uri2;
        this.o = ((a) cqtf.a(a.class)).iq();
    }
}
