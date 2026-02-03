package androidx.car.app.model;

import defpackage.cmb;
import defpackage.cpp;
import defpackage.crk;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class TemplateWrapper {
    private int mCurrentTaskStep;
    private String mId;
    private boolean mIsRefresh;
    private cpp mTemplate;
    private List<TemplateInfo> mTemplateInfoForScreenStack;

    private TemplateWrapper() {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = null;
        this.mId = "";
    }

    public static TemplateWrapper copyOf(TemplateWrapper templateWrapper) {
        TemplateWrapper templateWrapperWrap = wrap(templateWrapper.getTemplate(), templateWrapper.getId());
        templateWrapperWrap.setRefresh(templateWrapper.isRefresh());
        templateWrapperWrap.setCurrentTaskStep(templateWrapper.getCurrentTaskStep());
        List<TemplateInfo> templateInfosForScreenStack = templateWrapper.getTemplateInfosForScreenStack();
        if (templateInfosForScreenStack != null) {
            templateWrapperWrap.setTemplateInfosForScreenStack(templateInfosForScreenStack);
        }
        return templateWrapperWrap;
    }

    private static String createRandomId() {
        return UUID.randomUUID().toString();
    }

    public static TemplateWrapper wrap(cpp cppVar) {
        return wrap(cppVar, createRandomId());
    }

    public int getCurrentTaskStep() {
        return this.mCurrentTaskStep;
    }

    public String getId() {
        String str = this.mId;
        str.getClass();
        return str;
    }

    public cpp getTemplate() {
        cpp cppVar = this.mTemplate;
        cppVar.getClass();
        return cppVar;
    }

    public List<TemplateInfo> getTemplateInfosForScreenStack() {
        return crk.a(this.mTemplateInfoForScreenStack);
    }

    public boolean isRefresh() {
        return this.mIsRefresh;
    }

    public void setCurrentTaskStep(int i) {
        this.mCurrentTaskStep = i;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setRefresh(boolean z) {
        this.mIsRefresh = z;
    }

    public void setTemplate(cpp cppVar) {
        this.mTemplate = cppVar;
    }

    public void setTemplateInfosForScreenStack(List<TemplateInfo> list) {
        this.mTemplateInfoForScreenStack = list;
    }

    public String toString() {
        return "[template: " + this.mTemplate + ", ID: " + this.mId + "]";
    }

    private TemplateWrapper(cpp cppVar, String str) {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = cppVar;
        this.mId = str;
    }

    public static TemplateWrapper wrap(cpp cppVar, String str) {
        cppVar.getClass();
        str.getClass();
        return new TemplateWrapper(cppVar, str);
    }
}
