package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctdh extends ctdm {
    public MessageCoreData a;
    public Uri b;
    public int c;
    public ekgb d;
    public byte e;

    @Override // defpackage.ctdm
    public final void a(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null recipients");
        }
        this.d = ekgbVar;
    }
}
