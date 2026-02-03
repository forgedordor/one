package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rmd implements rlq {
    private final rlq a;
    private final Resources b;

    public rmd(Resources resources, rlq rlqVar) {
        this.b = resources;
        this.a = rlqVar;
    }

    private final Uri c(Integer num) throws Resources.NotFoundException {
        try {
            Resources resources = this.b;
            return Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + "/" + resources.getResourceTypeName(num.intValue()) + "/" + resources.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Objects.toString(num);
            Log.w("ResourceLoader", "Received invalid resource id: ".concat(String.valueOf(num)), e);
            return null;
        }
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) throws Resources.NotFoundException {
        Uri uriC = c((Integer) obj);
        if (uriC == null) {
            return null;
        }
        return this.a.a(uriC, i, i2, rexVar);
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
