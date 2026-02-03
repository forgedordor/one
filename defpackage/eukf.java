package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassifier;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eukf {
    private final List a;
    private final List b;
    private final List c;
    private final boolean d;

    public eukf(Collection collection, Collection collection2, boolean z) {
        this.c = collection == null ? Collections.EMPTY_LIST : new ArrayList(collection);
        this.b = collection2 == null ? Collections.EMPTY_LIST : new ArrayList(collection2);
        int i = ekgb.d;
        this.a = ekoe.a;
        this.d = z;
    }

    public final TextClassifier.EntityConfig a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return new TextClassifier.EntityConfig.Builder().setIncludedTypes(this.c).setExcludedTypes(this.b).setHints(this.a).includeTypesFromTextClassifier(this.d).build();
        }
        if (this.d) {
            return TextClassifier.EntityConfig.create(this.a, this.c, this.b);
        }
        css cssVar = new css(this.c);
        cssVar.removeAll(this.b);
        return TextClassifier.EntityConfig.createWithExplicitEntityList(new ArrayList(cssVar));
    }

    public final Collection b(Collection collection) {
        css cssVar = new css();
        if (this.d && collection != null) {
            cssVar.addAll(collection);
        }
        cssVar.addAll(this.c);
        cssVar.removeAll(this.b);
        return DesugarCollections.unmodifiableCollection(cssVar);
    }
}
