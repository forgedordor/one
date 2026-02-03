package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxg implements Iterable {
    public final Context a;
    private final ArrayList b = new ArrayList();

    public kxg(Context context) {
        this.a = context;
    }

    public final PendingIntent a(int i, int i2) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.a, i, intentArr, i2, null);
    }

    public final void b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.a.startActivities(intentArr, null);
    }

    public final Intent[] c() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        Intent[] intentArr = new Intent[size];
        if (size != 0) {
            intentArr[0] = new Intent((Intent) arrayList.get(0)).addFlags(268484608);
            for (int i = 1; i < size; i++) {
                intentArr[i] = new Intent((Intent) arrayList.get(i));
            }
        }
        return intentArr;
    }

    public final void d(Intent intent) {
        this.b.add(intent);
    }

    public final void e(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.a.getPackageManager());
        }
        if (component != null) {
            f(component);
        }
        d(intent);
    }

    public final void f(ComponentName componentName) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        try {
            Context context = this.a;
            for (Intent intentB = kuw.b(context, componentName); intentB != null; intentB = kuw.b(context, intentB.getComponent())) {
                arrayList.add(size, intentB);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.b.iterator();
    }
}
