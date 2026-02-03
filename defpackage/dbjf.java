package defpackage;

import com.google.android.gms.appdatasearch.SearchResults;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbjf implements Iterator {
    protected int a;
    public dbjd b;
    public final Map[] c;
    final /* synthetic */ SearchResults d;

    public dbjf(SearchResults searchResults) {
        String[] strArr;
        this.d = searchResults;
        Map[] mapArr = null;
        if (!searchResults.a() && (strArr = searchResults.i) != null) {
            mapArr = new Map[strArr.length];
        }
        this.c = mapArr;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dbje next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        SearchResults searchResults = this.d;
        int i = this.a;
        dbje dbjeVar = new dbje(searchResults, i, this);
        this.a = i + 1;
        return dbjeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        SearchResults searchResults = this.d;
        return !searchResults.a() && this.a < searchResults.g;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
