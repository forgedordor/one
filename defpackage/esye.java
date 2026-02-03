package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import defpackage.esyd;
import defpackage.esyv;
import defpackage.etcz;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esye {
    private final esxx f;
    private final ArrayDeque g;
    private final int h;
    private final int i;
    private Excluder c = Excluder.a;
    public int b = 1;
    private final Map d = new HashMap();
    public final List a = new ArrayList();
    private final List e = new ArrayList();

    public esye() {
        int i = esyd.g;
        this.f = esyd.a;
        this.h = esyd.e;
        this.i = esyd.f;
        this.g = new ArrayDeque();
    }

    public final esyd a() {
        List list = this.e;
        List list2 = this.a;
        ArrayList arrayList = new ArrayList(list2.size() + list.size() + 3);
        arrayList.addAll(list2);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(list);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        boolean z = etcy.a;
        Excluder excluder = this.c;
        int i = this.b;
        HashMap map = new HashMap(this.d);
        new ArrayList(list2);
        new ArrayList(list);
        ArrayList arrayList3 = new ArrayList(this.g);
        return new esyd(excluder, i, map, this.f, arrayList, this.h, this.i, arrayList3);
    }

    public final void b() {
        Excluder excluderClone = this.c.clone();
        excluderClone.d = true;
        this.c = excluderClone;
    }

    public final void c(Type type, Object obj) {
        boolean z = obj instanceof ConversationSuggestionResponseSerializer.AnonymousClass1;
        eszw.a(z || (obj instanceof esyi) || (obj instanceof esyf) || (obj instanceof esyv));
        if (type == Object.class) {
            throw new IllegalArgumentException("Cannot override built-in adapter for ".concat(type.toString()));
        }
        if (obj instanceof esyf) {
            this.d.put(type, (esyf) obj);
        }
        if (z || (obj instanceof esyi)) {
            etcz etczVar = new etcz(type);
            this.a.add(new TreeTypeAdapter.SingleTypeFactory(obj, etczVar, etczVar.b == etczVar.a));
        }
        if (obj instanceof esyv) {
            final etcz etczVar2 = new etcz(type);
            final esyv esyvVar = (esyv) obj;
            this.a.add(new esyw() { // from class: com.google.gson.internal.bind.TypeAdapters$28
                @Override // defpackage.esyw
                public final esyv a(esyd esydVar, etcz etczVar3) {
                    if (etczVar3.equals(etczVar2)) {
                        return esyvVar;
                    }
                    return null;
                }
            });
        }
    }
}
