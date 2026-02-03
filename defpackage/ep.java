package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.app.FragmentContainerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ep implements LayoutInflater.Factory2 {
    final fr a;

    public ep(fr frVar) {
        this.a = frVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        gc gcVarN;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ca.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                int i = em.a;
                try {
                    if (ea.class.isAssignableFrom(em.a(classLoader, attributeValue))) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1) {
                            if (resourceId != -1) {
                                id = -1;
                            } else {
                                if (string == null) {
                                    throw new IllegalArgumentException(a.k(attributeValue, attributeSet, ": Must specify unique android:id, android:tag, or have a parent with an id for "));
                                }
                                id = -1;
                                resourceId = -1;
                            }
                        }
                        ea eaVarG = resourceId != -1 ? this.a.g(resourceId) : null;
                        if (eaVarG == null && string != null) {
                            eaVarG = this.a.h(string);
                        }
                        if (eaVarG == null && id != -1) {
                            eaVarG = this.a.g(id);
                        }
                        if (eaVarG == null) {
                            fr frVar = this.a;
                            em emVarK = frVar.k();
                            context.getClassLoader();
                            ea eaVarB = emVarK.b(attributeValue);
                            eaVarB.v = true;
                            eaVarB.F = resourceId != 0 ? resourceId : id;
                            eaVarB.G = id;
                            eaVarB.H = string;
                            eaVarB.w = true;
                            eaVarB.B = frVar;
                            eaVarB.C = frVar.o;
                            eaVarB.ak(frVar.o.c, attributeSet, eaVarB.h);
                            gcVarN = frVar.m(eaVarB);
                            if (fr.ad(2)) {
                                Log.v("FragmentManager", "Fragment " + eaVarB + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            }
                            eaVarG = eaVarB;
                        } else {
                            if (eaVarG.w) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                            }
                            eaVarG.w = true;
                            fr frVar2 = this.a;
                            eaVarG.B = frVar2;
                            eaVarG.C = frVar2.o;
                            eaVarG.ak(frVar2.o.c, attributeSet, eaVarG.h);
                            gcVarN = frVar2.n(eaVarG);
                            if (fr.ad(2)) {
                                Log.v("FragmentManager", "Retained Fragment " + eaVarG + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        int i2 = lsb.a;
                        eaVarG.getClass();
                        lsc lscVar = new lsc(eaVarG, viewGroup);
                        lsb.d(lscVar);
                        lsa lsaVarB = lsb.b(eaVarG);
                        if (lsaVarB.b.contains(lrz.d) && lsb.e(lsaVarB, eaVarG.getClass(), lscVar.getClass())) {
                            lsb.c(lsaVarB, lscVar);
                        }
                        eaVarG.P = viewGroup;
                        gcVarN.e();
                        gcVarN.d();
                        View view2 = eaVarG.Q;
                        if (view2 == null) {
                            throw new IllegalStateException(a.a(attributeValue, "Fragment ", " did not create a view."));
                        }
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (eaVarG.Q.getTag() == null) {
                            eaVarG.Q.setTag(string);
                        }
                        eaVarG.Q.addOnAttachStateChangeListener(new eo(this, gcVarN));
                        return eaVarG.Q;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
