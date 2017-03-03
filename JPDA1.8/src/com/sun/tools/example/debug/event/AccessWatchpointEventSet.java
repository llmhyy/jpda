/*
 * Copyright (c) 1999, 2011, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

/*
 * This source code is provided to illustrate the usage of a given feature
 * or technique and has been deliberately simplified. Additional steps
 * required for a production-quality application, such as security checks,
 * input validation and proper error handling, might not be present in
 * this sample code.
 */


package com.sun.tools.example.debug.event;

import com.sun.jdi.event.*;

public class AccessWatchpointEventSet extends WatchpointEventSet {

    private static final long serialVersionUID = -2620394219156607673L;

    AccessWatchpointEventSet(EventSet jdiEventSet) {
        super(jdiEventSet);
    }

    @Override
    public void notify(JDIListener listener) {
        listener.accessWatchpoint(this);
    }
}
