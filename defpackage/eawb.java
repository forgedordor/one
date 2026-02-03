package defpackage;

import com.google.android.libraries.places.api.net.kotlin.PlacesClientKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eawb extends fcyv {
    public /* synthetic */ Object a;
    public int b;

    public eawb(fcxy fcxyVar) {
        super(fcxyVar);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return PlacesClientKt.awaitFetchPhoto(null, null, null, this);
    }
}
