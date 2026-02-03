package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ekbx extends ekbi implements ekot {
    private static final long serialVersionUID = 7431625294878419160L;

    protected ekbx(Map map) {
        super(map);
    }

    @Override // defpackage.ekbi, defpackage.ekmj
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final Set d(Object obj) {
        return (Set) super.d(obj);
    }

    @Override // defpackage.ekbi
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.ekbi
    public final /* synthetic */ Collection b() {
        return Collections.EMPTY_SET;
    }

    @Override // defpackage.ekbi
    public final Collection e(Collection collection) {
        return DesugarCollections.unmodifiableSet((Set) collection);
    }

    @Override // defpackage.ekbi
    public final Collection f(Object obj, Collection collection) {
        return new ekbh(this, obj, (Set) collection);
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Set u() {
        return (Set) super.u();
    }

    @Override // defpackage.ekbi, defpackage.ekmj
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Set c(Object obj) {
        return (Set) super.c(obj);
    }
}
