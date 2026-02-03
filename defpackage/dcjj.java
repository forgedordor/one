package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dcjj {
    public final DataHolder a;
    protected final int b;
    public final int c;

    public dcjj(DataHolder dataHolder, int i) {
        dclh.m(dataHolder);
        this.a = dataHolder;
        boolean z = false;
        if (i >= 0 && i < dataHolder.i) {
            z = true;
        }
        dclh.h(z);
        this.b = i;
        this.c = dataHolder.b(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcjj) {
            dcjj dcjjVar = (dcjj) obj;
            if (dclc.a(Integer.valueOf(dcjjVar.b), Integer.valueOf(this.b)) && dclc.a(Integer.valueOf(dcjjVar.c), Integer.valueOf(this.c)) && dcjjVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int gs(String str) {
        return this.a.a(str, this.b, this.c);
    }

    protected final String gt(String str) {
        return this.a.c(str, this.b, this.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }
}
