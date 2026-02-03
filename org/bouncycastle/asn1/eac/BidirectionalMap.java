package org.bouncycastle.asn1.eac;

import java.util.Hashtable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class BidirectionalMap extends Hashtable {
    private static final long serialVersionUID = -7457289971962812909L;
    final Hashtable a = new Hashtable();

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.a.put(obj2, obj);
        return super.put(obj, obj2);
    }
}
