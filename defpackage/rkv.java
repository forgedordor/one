package defpackage;

import android.os.ParcelFileDescriptor;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rkv implements rky {
    @Override // defpackage.rky
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.rky
    public final /* bridge */ /* synthetic */ Object b(File file) {
        return ParcelFileDescriptor.open(file, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
    }

    @Override // defpackage.rky
    public final /* synthetic */ void c(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }
}
