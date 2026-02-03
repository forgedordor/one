package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kve {
    public boolean a;
    public final Bundle b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    private final IconCompat g;
    private final CharSequence h;
    private final PendingIntent i;
    private ArrayList j;

    public kve(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.i(null, "", i) : null, charSequence, pendingIntent, new Bundle());
    }

    public final kvf a() {
        CharSequence[] charSequenceArr;
        if (this.e && this.i == null) {
            throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.j;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                kxb kxbVar = (kxb) arrayList3.get(i);
                if (kxbVar.d || (!((charSequenceArr = kxbVar.c) == null || charSequenceArr.length == 0) || kxbVar.g.isEmpty())) {
                    arrayList2.add(kxbVar);
                } else {
                    arrayList.add(kxbVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new kvf(this.g, this.h, this.i, this.b, arrayList2.isEmpty() ? null : (kxb[]) arrayList2.toArray(new kxb[arrayList2.size()]), this.a, this.c, this.d, this.e, this.f);
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.b.putAll(bundle);
        }
    }

    public final void c(kxb kxbVar) {
        if (this.j == null) {
            this.j = new ArrayList();
        }
        if (kxbVar != null) {
            this.j.add(kxbVar);
        }
    }

    public kve(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle());
    }

    private kve(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.a = true;
        this.d = true;
        this.g = iconCompat;
        this.h = kvq.c(charSequence);
        this.i = pendingIntent;
        this.b = bundle;
        this.j = null;
        this.a = true;
        this.c = 0;
        this.d = true;
        this.e = false;
        this.f = false;
    }
}
